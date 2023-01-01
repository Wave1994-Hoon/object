package v3.Paper;

import v3.Language;
import v3.Library;
import v3.programmer.Programmer;

public class Client implements Paper {
    Library library = new Library("vueJs");
    Language language = new Language("kotlinJs");
    Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }
}
