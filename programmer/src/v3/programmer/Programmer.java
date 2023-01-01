package v3.programmer;

import v3.Paper.Paper;
import v3.Program;

public abstract class Programmer<T extends Paper> {
    public Program getProgram(T paper) {
        setData(paper);
        return makeProgram();
    }

    abstract protected void setData(T paper); // 구현체가 알아서 하라
    abstract protected Program makeProgram();
}
