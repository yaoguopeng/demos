package com.example.testcode;

import com.example.testcode.tests.AlphabetUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCodeApplicationTests {

    @Test
    void testRemoveIdenticalAlphabets() {
        AlphabetUtil.removeIdenticalAlphabets("aabcccbbad");
    }

    @Test
    void testReplaceIdenticalAlphabets() {
        AlphabetUtil.replaceIdenticalAlphabets("abcccbad");
    }

}
