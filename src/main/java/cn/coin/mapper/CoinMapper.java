package cn.coin.mapper;

import cn.coin.vo.CoinVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CoinMapper {

    public List<CoinVO> coinList();
}
