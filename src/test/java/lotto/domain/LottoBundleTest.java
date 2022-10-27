package lotto.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoBundleTest {

    @Test
    void test1() {
        List<Lotto> lottos = Arrays.asList(
                new Lotto(Arrays.asList(1, 2, 3, 4, 5, 45))
        );
        LottoBundle lottoBundle = new LottoBundle(lottos);

        List<String> lottoPrints = lottoBundle.printAll();

        assertThat(lottoPrints.get(0)).matches("\\[[0-9,]+\\]");
    }
}