package v2.Paper;

import v2.Language;
import v2.Server;
import v2.programmer.BackEnd;
import v2.programmer.FrontEnd;
import v2.programmer.Programmer;

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

    @Override
    public void setData(Programmer programmer) {
        /*
         * 제네릭을 사용하는데, 분기 처리가 두개이면 어떻게 해야할까 ???
         * 다른 방법을 찾아야한다.
         */
        if (programmer instanceof FrontEnd) {
            // TODO
        } else if (programmer instanceof BackEnd) {
            // TODO
        }
    }
}
