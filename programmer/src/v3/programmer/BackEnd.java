package v3.programmer;

import v3.Language;
import v3.Paper.Paper;
import v3.Program;
import v3.Server;

/**
 * setData 는 BackEnd 에서 구현하지 않고 그 하위 객체에서 구현한다.
 * 바깥으로 밀어내기 위해, 여기에 있다면 if/else 가 생길 것이다.
 */
public abstract class BackEnd<T extends Paper> extends Programmer<T> {
    protected Server server;
    protected Language language;

    @Override
    protected Program makeProgram() {
        return new Program();

//        if (paper instanceof ServerClient) {
//            // TODO
//        }
//        return makeBackEndProgram();
    }

//    abstract void setData(ServerClient paper);

//    private Program makeBackEndProgram() {
//        return new Program();
//    }
}

