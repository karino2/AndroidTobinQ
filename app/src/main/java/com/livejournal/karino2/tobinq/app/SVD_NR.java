// SVD in java
// translated from NR svdcmp.c, this has worked on several examples,
// but check the results before trusting it completely
//
// zlib - this just contains an assert routine, you can comment it out.

package com.livejournal.karino2.tobinq.app;


/****************
results from matlab

M = [1.0, 1.0, 1.0, 1.0, 1.0;
0.0, 0.7578582801241234, 0.8705505614977934, 0.9440875104854797, 1.0;
0.0, 0.5743491727526943, 0.7578582801241234, 0.8913012274546708, 1.0;
0.0, 0.4352752672614163, 0.6597539444834084, 0.841466353313137, 1.0;
0.0, 0.3298769722417042, 0.5743491727526943, 0.7944178780622027, 1.0;
0.0, 0.25, 0.5, 0.75, 1.0 ]

[U,D,V] = svd(M);
D

D =

    4.0143         0         0         0         0
         0    0.9803         0         0         0
         0         0    0.3522         0         0
         0         0         0    0.0209         0
         0         0         0         0    0.0004
         0         0         0         0         0

>> V

V =

    0.1290   -0.8538    0.5019   -0.0503    0.0022
    0.3605   -0.3537   -0.6377    0.5576   -0.1651
    0.4543   -0.0929   -0.3332   -0.5544    0.6055
    0.5325    0.1348    0.0544   -0.4113   -0.7254
    0.6029    0.3452    0.4769    0.4583    0.2827

----------------
results from java version:
D=
[ 4.014  0.980  0.352  0.021  0.000  ]
V=
[ -0.129  0.854  -0.502  0.050  0.002  ]
[ -0.360  0.354  0.638  -0.558  -0.165  ]
[ -0.454  0.093  0.333  0.554  0.606  ]
[ -0.533  -0.135  -0.054  0.411  -0.725  ]
[ -0.603  -0.345  -0.477  -0.458  0.283  ]

****************/

/**
 */
public final class SVD_NR
{

  /**
   * returns U in a. normaly U is nr*nr,
   * but if nr>nc only the first nc columns are returned
   * (nice, saves memory).
   * The columns of U have arbitrary sign,
   * also the columns corresponding to near-zero singular values
   * can vary wildly from other implementations.
   */
  public static void svd(double[][] a,double[] w,double[][] v)
  {
    int i,its,j,jj,k,l=0,nm=0;
    boolean flag;
    int m = a.length;
    int n = a[0].length;
    double c,f,h,s,x,y,z;
    double anorm = 0., g = 0., scale=0. ;
    // zliberror._assert(m>=n) ;
    double[] rv1 = new double[n];

    System.out.println("SVD beware results may not be sorted!");

    for (i = 0; i<n; i++) {
      l = i+1;
      rv1[i] = scale*g;
      g = s = scale  = 0. ;
      if  (i<m) {
	for  (k = i; k<m; k++)  scale += abs(a[k][i]) ;
	if (scale!=0.0) {
	  for (k = i; k<m; k++) {
	    a[k][i] /= scale;
	    s += a[k][i]*a[k][i] ;
	  }
	  f = a[i][i];
	  g = -SIGN(Math.sqrt(s),f) ;
	  h=f*g-s;
	  a[i][i]=f-g;
	  //if (i!=(n-1)) {		// CHECK
	    for (j = l; j<n; j++) {
	      for (s = 0,k = i; k<m; k++)
		s += a[k][i]*a[k][j];
	      f = s/h;
	      for (k = i; k<m; k++)
		a[k][j] += f*a[k][i];
	    }
	    //}
	  for (k = i; k<m; k++) a[k][i] *= scale;
	}
      }
      w[i] = scale*g;
      g = s = scale = 0.0 ;
      if (i<m && i!=n-1) {		//
	for (k = l; k<n; k++)
	  scale += abs(a[i][k]) ;
	if  (scale != 0.) {
	  for  (k = l; k<n; k++) {	//
	    a[i][k]  /= scale;
	    s += a[i][k]*a[i][k] ;
	  }
	  f = a[i][l];
	  g = -SIGN(Math.sqrt(s),f);
	  h = f*g-s;
	  a[i][l] = f-g;
	  for  (k = l; k<n; k++)
	    rv1[k] = a[i][k]/h;
	  if (i!=m-1) {		//
	    for (j = l; j<m; j++) {	//
	      for (s = 0, k = l; k<n; k++)
		s += a[j][k]*a[i][k] ;
	      for (k = l; k<n; k++)
		a[j][k] += s*rv1[k] ;
	    }
	  }
	  for (k = l; k<n; k++)
	    a[i][k] *= scale;
	}
      } //i<m && i!=n-1
      anorm = Math.max(anorm,(abs(w[i])+abs(rv1[i])));
    } //i
    for (i = n-1; i>=0; --i) {
      if (i<n-1) {			//
	if (g != 0.) {
	  for (j = l; j<n; j++)
	  v[j][i] = (a[i][j]/a[i][l])/g;
	  for (j = l; j<n; j++) {
	    for (s = 0,k = l; k<n; k++)
	      s += a[i][k]*v[k][j];
	    for (k = l; k<n; k++)
	      v[k][j] += s*v[k][i];
	  }
	}
	for (j = l; j<n; j++)		//
	v[i][j] = v[j][i] = 0.0;
      }
      v[i][i] = 1.0;
      g = rv1[i];
      l = i;
    }
    //for (i=IMIN(m,n);i>=1;i--) {	// !
    //for (i = n-1; i>=0; --i)  {
    for (i = Math.min(m-1,n-1); i>=0; --i) {
      l = i+1;
      g = w[i];
      if (i<n-1)			//
      for (j = l; j<n; j++)		//
      a[i][j] = 0.0;
      if (g != 0.) {
	g = 1./g;
	if (i!= n-1) {
	  for(j = l; j<n; j++) {
	    for (s = 0, k = l; k<m; k++)
	      s += a[k][i]*a[k][j];
	    f = (s/a[i][i])*g;
	    for (k = i; k<m; k++)
	      a[k][j] += f*a[k][i];
	  }
	}
	for (j = i; j < m; j++)
	  a[j][i] *= g;
      }
      else {
	for (j = i; j<m; j++)
	a[j][i] = 0.0;
      }
      a[i][i] += 1.0;
    }
    for (k = n-1; k>=0; --k)  {
      for (its = 1; its<=30; ++its) {
	flag = true;
	for (l = k; l>=0;  --l) {
	  nm = l-1;
	  if ((abs(rv1[l])+anorm) == anorm) {
	    flag = false;
	    break ;
	  }
	  if ((abs(w[nm])+anorm)  == anorm) break;
	}
	if (flag) {
	  c = 0.0;
	  s = 1.0;
	  for (i = l; i<=k; i++)  {	//
	    f = s*rv1[i];
	    rv1[i] = c*rv1[i];
	    if ((abs(f)+anorm)==anorm)
	      break;
	    g = w[i];
	    h = pythag(f,g) ;
	    w[i] = h;
	    h = 1.0/h;
	    c = g*h;
	    s = -f*h;
	    for (j = 0; j<m; j++) {
	      y = a[j][nm] ;
	      z = a[j][i];
	      a[j][nm] = y*c+z*s;
	      a[j][i] = z*c-y*s;
	    }
	  }
	} //flag
	z = w[k];
	if (l==k) {
	  if (z<0.) {
	    w[k] = -z;
	    for (j = 0; j<n; j++)
	      v[j][k] = -v[j][k];
	  }
	  break;
	} //l==k
	// zliberror._assert(its<50, "no svd convergence in 50 iterations");
	x = w[l];
	nm = k-1;
	y = w[nm];
	g = rv1[nm] ;
	h = rv1[k] ;
	f = ((y-z)*(y+z)+(g-h)*(g+h))/(2*h*y);
	g = pythag(f,1.0) ;
	f = ((x-z)*(x+z)+h*((y/(f+SIGN(g,f)))-h))/x;
	c = s = 1.0;
	for (j = l; j<=nm; j++) {
	  i = j+1;
	  g = rv1[i];
	  y = w[i];
	  h = s*g;
	  g = c*g;
	  z = pythag(f,h) ;
	  rv1[j] = z;
	  c = f/z;
	  s = h/z;
	  f = x*c+g*s;
	  g = g*c-x*s;
	  h = y*s;
	  y *= c;
	  for (jj = 0; jj<n; jj++) {
	    x = v[jj][j];
	    z = v[jj][i];
	    v[jj][j] = x*c+z*s;
	    v[jj][i] = z*c-x*s;
	  }
	  z = pythag(f,h) ;
	  w[j] = z;
	  if (z != 0.0) {
	    z = 1.0/z;
	    c = f*z;
	    s = h*z;
	  }
	  f = c*g+s*y;
	  x = c*y-s*g;
	  for (jj = 0; jj<m; ++jj) {
	    y = a[jj][j];
	    z = a[jj][i];
	    a[jj][j] = y*c+z*s;
	    a[jj][i] = z*c-y*s;
	  }
	} //j<nm
	rv1[l] = 0.0;
	rv1[k] = f;
	w[k] = x;
      } //its
    } //k
    // free rv1
  } //svd

    public static void Rsvd(double[][] a,double[] w,double[][] v)
    {
        svd(a, w, v);
        int[] marker = new int[w.length];
        for(int k = 0; k < w.length; k++)
            marker[k] = k;

        for(int i = 0; i < w.length; i++)
        {
            for(int j = w.length-1; j > i; j--)
            {
                if(w[j-1] < w[j])
                {
                    swap(j-1, j, w);
                    swapI(j-1, j, marker);
                }
            }
        }

        for(int l = 0; l < marker.length; l++)
        {
            if(marker[l] != l)
            {
                swap(l, marker[l], a);
                swapRow(l, marker[l], v);
                marker[marker[l]] = marker[l];
            }
        }
    }

    private static final void swapI(int i1, int i2, int[] w) {
        int tmp = w[i1];
        w[i1] = w[i2];
        w[i2] = tmp;
    }

    private static final void swap(int i1, int i2, double[] w) {
        double tmp = w[i1];
        w[i1] = w[i2];
        w[i2] = tmp;
    }
    static double[] _tmp = null;
    private static final double[] getArray(int len)
    {
        if(_tmp == null || _tmp.length != len)
            _tmp = new double[len];
        return _tmp;
    }
    private static final void swapRow(int i1, int i2, double[][] v) {
        double[] tmp = getArray(v[0].length);
        copy(tmp, v[i1]);
        copy(v[i1], v[i2]);
        copy(v[i2], tmp);

    }
    private static final void copyColToVector(double[] dst, double[][] v, int i1) {
        for(int i = 0; i < v[0].length; i++)
            dst[i] = v[i][i1];
    }
    private static final void swap(int i1, int i2, double[][] a) {
        double[] tmp = getArray(a.length);
        copyColToVector(tmp, a, i1);
        copyCol(a, i1, a, i2);
        copyColFromVector(a, i2, tmp);
    }


    private static final void copyColFromVector(double[][] a, int i2, double[] tmp) {
        for(int i = 0; i < tmp.length; i++)
            a[i][i2] = tmp[i];
    }
    private static final void copyCol(double[][] dst, int i1, double[][] src, int i2) {
        for(int i = 0; i < src[0].length; i++)
            dst[i][i1] = src[i][i2];
    }
    private static final void copy(double[] dst, double[] src) {
        for(int i = 0; i < src.length; i++)
            dst[i] = src[i];
    }

  static final double abs(double a)
  {
    return (a < 0.) ? -a  : a;
  }

  static final double pythag(double a, double b)
  {
    return Math.sqrt(a*a + b*b);
  }

  static final double SIGN(double a,double b)
  {
    return ((b) >= 0. ? abs(a) : -abs(a));
  }

  //----------------------------------------------------------------


} //SVD_NR


