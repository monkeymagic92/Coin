package cn.coin.controller;

import cn.coin.service.CoinService;
import cn.coin.vo.CoinVO;
import cn.common.ViewRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CoinController {

    @Autowired
    private CoinService service;

    @RequestMapping(value = "/coin/index", method = RequestMethod.GET)
    public String coinList(Model model, CoinVO vo) {

        model.addAttribute("name", "이재용@@@@@@@");
        model.addAttribute("list", service.coinList());
        model.addAttribute("view", "/coin/index");

        return ViewRef.INCLUDE;
    }
}
