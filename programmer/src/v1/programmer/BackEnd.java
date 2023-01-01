package v1.programmer;

import v1.Language;
import v1.Paper.Paper;
import v1.Paper.ServerClient;
import v1.Program;
import v1.Server;

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
}

