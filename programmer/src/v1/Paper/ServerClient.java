package v1.Paper;

import v1.Language;
import v1.Paper.Paper;
import v1.Server;
import v1.programmer.Programmer;

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
