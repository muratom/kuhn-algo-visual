package mkn.view;

import mkn.controller.*;

public interface View {

    void setText(String text);

    void setImage(String path);

    void setController(Controller controller);
}