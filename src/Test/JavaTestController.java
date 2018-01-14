package Test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class JavaTestController {

    @RequestMapping(value = "/javaMvc", method = RequestMethod.GET)
//    public String sayHello(Model model) {
////        model.addAttribute("msg", "nnnnbbbb");
////
////        return "HelloWorld";
////    }
    public ModelAndView showHello(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("HelloWorld");
        mav.addObject("msg", "normal msg");
        return mav;
    }
}
