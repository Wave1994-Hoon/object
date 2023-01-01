package v2.programmer;

import v2.Language;
import v2.Paper.Paper;
import v2.Paper.ServerClient;
import v2.Program;
import v2.Server;

public class BackEnd implements Programmer {
    private Server server;
    private Language language;

    @Override
    public Program makeProgram(Paper paper) {
        if (paper instanceof ServerClient) {
            // TODO
        }
        return makeBackEndProgram();
    }

    private Program makeBackEndProgram() {
        return new Program();
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}

