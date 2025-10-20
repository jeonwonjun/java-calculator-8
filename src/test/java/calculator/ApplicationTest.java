package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 커스텀_구분자_사용() {
        assertSimpleTest(() -> {
            run("//;\\n1");
            assertThat(output()).contains("결과 : 1");
        });
    }

    @Test
    void 음수_부호_사용() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("-1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 잘못된_구분자_사용() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("-1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 빈_문자열() {
        assertSimpleTest(() -> {
            run(" ");
            assertThat(output()).contains("결과 : 0");
        });
    }

    @Test
    void 쉼표_구분자_사용() {
        assertSimpleTest(() -> {
            run("1,2");
            assertThat(output()).contains("결과 : 3");
        });
    }

    @Test
    void 콜론_구분자_사용() {
        assertSimpleTest(() -> {
            run("1:2");
            assertThat(output()).contains("결과 : 3");
        });
    }

    @Test
    void 혼용_구분자_사용() {
        assertSimpleTest(() -> {
            run("1,2:3");
            assertThat(output()).contains("결과 : 6");
        });
    }

    @Test
    void 공백_제거_처리() {
        assertSimpleTest(() -> {
            run("1, 2, 3 ");
            assertThat(output()).contains("결과 : 6");
        });
    }

    @Test
    void 연속된_구분자_사용() {
        assertSimpleTest(() -> {
            run("1,,3");
            assertThat(output()).contains("결과 : 4");
        });
    }

    @Test
    void 자연수_입력_검사() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("0,1,2"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 문자_입력_검사() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1,a,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 잘못된_커스텀_구분자_형식() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//;\\1;2;3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 커스텀_구분자_누락() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//\n1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 소수점_계산() {
        assertSimpleTest(() -> {
            run("1.5,2");
            assertThat(output()).contains("결과 : 3.5");
        });
    }

    @Test
    void 점_구분자_사용() {
        assertSimpleTest(() -> {
            run("//.\n1.5,2");
            assertThat(output()).contains("결과 : 8");
        });
    }

    @Test
    void 다중_문자_구분자_사용() {
        assertSimpleTest(() -> {
            run("//az\n1az2");
            assertThat(output()).contains("결과 : 3");
        });
    }

    @Test
    void 커스텀_구분자_숫자() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//1\n112"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 정수범위_초과_입력() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("999999999999999,1"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 정수범위_초과_합() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("2147483000,10000"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
