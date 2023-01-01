package v2.Paper;

import v2.Language;
import v2.Library;
import v2.programmer.FrontEnd;
import v2.programmer.Programmer;

public class Client implements Paper<FrontEnd> {
    Library library = new Library("vueJs");
    Language language = new Language("kotlinJs");
    Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void setData(FrontEnd programmer) {
        // TO-BE
        programmer.setLibrary(library);
        programmer.setLanguage(language);

        // AS-IS
//        if (programmer instanceof FrontEnd) {
//            // TODO
//        }
    }
}
