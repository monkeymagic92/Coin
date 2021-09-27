package cn.coin.controller;

import cn.coin.service.CoinService;
import cn.coin.vo.CoinVO;
import cn.common.ViewRef;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class CoinController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private CoinService service;

    @RequestMapping(value = "/coin/index", method = RequestMethod.GET)
    public String coinList(Model model, CoinVO vo) {

        // ============= 업비트 인증 토큰 받기 (parameter X) =================
        String accessKey = "6x6ksuq2k5GxrDIlUlIiu2kFnItlsiSrxfXi8h2l";
        String secretKey = "KiBi84J3kJ6rAVrzHZafiAaOV98Gaw22PuzgbhoO";

        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        String jwtToken = JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(algorithm);

        String authenticationToken = "Bearer " + jwtToken;

        System.out.println("-------업비트 authenticationToken------");
        System.out.println(authenticationToken);
        System.out.println("-------------");
        // ============= 업비트 인증 토큰 받기 (parameter X) =================

        model.addAttribute("list", service.coinList());
        ViewRef.viewRes("/coin/index", model);

        return ViewRef.INCLUDE;
    }

    @RequestMapping(value = "/coin/index", method = RequestMethod.POST)
    @ResponseBody
    public CoinVO coinList(CoinVO vo, HttpServletRequest request) {
        System.out.println("---------");
        System.out.println(vo.getI_num());
        System.out.println(vo.getTitle());
        System.out.println("---------");

        return vo;
    }
}
