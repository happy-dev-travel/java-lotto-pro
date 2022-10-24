package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("SET의 사이즈 검증")
    void set_size() {
        Integer result = numbers.size();
        assertThat(result).isEqualTo(3);
    }

    @ParameterizedTest()
    @ValueSource(ints = {1,2,3})
    @DisplayName("변수 입력하여 검증")
    void set_parameter(Integer input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true","2:true","3:true", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("변수와 예상값 입력하여 검증")
    void set_parameter_expect(Integer input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
