package cn.common;

        import org.springframework.ui.Model;

public class ViewRef {

    public static final String INCLUDE = "main/index";

    public static void viewRes(String url, Model model) {
        model.addAttribute("view", url);
    }
}
