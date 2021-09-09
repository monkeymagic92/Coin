package cn.coin.service;

import cn.coin.mapper.CoinMapper;
import cn.coin.vo.CoinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinService {

    @Autowired
    private CoinMapper mapper;

    public List<CoinVO> coinList() {
        return mapper.coinList();
    }
}
