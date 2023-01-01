package v1.programmer;

import v1.*;
import v1.Paper.Client;
import v1.Paper.Paper;

public class FrontEnd implements Programmer{
    private Language language;
    private Library library;

    @Override
    public Program makeProgram(Paper paper) {
        /*
         * Paper 는 마커인터페이스이기 때문에 인터페이스로부터 어떠한 정보도 얻을 수 없다.
         * 정보를 얻기 위해서는 다운캐스팅을 할 수 밖에 없지만 이것이 리스코프치환원칙을 어기게 된다.
         * Clinet 가 계속 추가되어도 컴파일에러, 런타임에러도 발생하지 않는다.
         */
        if (paper instanceof Client) {
            // TODO
        }
        return makeFrontEndProgram();
    }

    private Program makeFrontEndProgram() {
        return new Program();
    }
}
