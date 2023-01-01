package v3.programmer;

import v3.Language;
import v3.Library;
import v3.Paper.Paper;
import v3.Paper.ServerClient;
import v3.Program;

public abstract class FrontEnd<T extends Paper> extends Programmer<T> {
    protected Language language;
    protected Library library;

    @Override
    protected Program makeProgram() {
        return new Program();
//        if (paper instanceof Client) {
//            // TODO
//        }
//        return makeFrontEndProgram();
    }

//    public abstract void setData(ServerClient paper);

//    private Program makeFrontEndProgram() {
//        return new Program();
//    }
}
