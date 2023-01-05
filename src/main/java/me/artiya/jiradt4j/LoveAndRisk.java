
package me.artiya.jiradt4j;

import java.util.ArrayList;
import java.util.List;

/**
 * สำหรับ 'ความรัก'
 * พอเริ่ม 'ทุ่มเท'
 * ก็จะเริ่มมี 'ความเสี่ยง'
 * Created by robot on 24/07/15.
 */
public class LoveAndRisk {

    public static void main(String[] args) {
        List<Love> loves = new ArrayList<>();
        loves.add(() -> {
            // ทุ่มเท
        });
        loves.stream().forEach(love -> {
            try {
                love.dedicated();
            } catch (Risk risk) {
                // TODO Handle the risk.
            }
        });
    }

    interface Love {
        void dedicated() throws Risk;
    }

    private static class Risk extends Exception {
    }

}