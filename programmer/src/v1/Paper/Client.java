package v1.Paper;

import v1.Language;
import v1.Library;
import v1.Paper.Paper;
import v1.programmer.Programmer;

public class Client implements Paper {
    Library library = new Library("vueJs");
    Language language = new Language("kotlinJs");
    Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }
}
