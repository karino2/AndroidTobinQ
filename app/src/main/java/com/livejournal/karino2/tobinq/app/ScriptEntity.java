package com.livejournal.karino2.tobinq.app;

/**
 * Created by karino on 4/11/14.
 */
public class ScriptEntity {
    public long id = -1;
    public String _docId;
    public String title;
    public String _description;
    public String _script;
    public long _updatedAt;
    public ScriptEntity() {}

    public String getDocId() {
        return _docId;
    }

    public void setDocId(String docId) {
        this._docId = docId;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public String getScript() {
        return _script;
    }

    public void setScript(String script) {
        this._script = script;
    }

    public long getDate() {
        return _updatedAt;
    }

    public void setDate(long date) {
        this._updatedAt = date;
    }
}
