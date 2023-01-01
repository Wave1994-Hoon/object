package v3.Paper;

import v3.Language;
import v3.Server;
import v3.programmer.Programmer;

public class ServerClient implements Paper {
    Server server = new Server("test");
    Language backEndLanguage = new Language("java");
    Language frontEndLanguage = new Language("kotlinJs");

    private Programmer backEndProgrammer;
    private Programmer frontEndProgrammer;

    public void setBackEndProgrammer(Programmer programmer) {
        this.backEndProgrammer = programmer;
    }

    public void setFrontEndProgrammer(Programmer programmer) {
        this.frontEndProgrammer = programmer;
    }
}
