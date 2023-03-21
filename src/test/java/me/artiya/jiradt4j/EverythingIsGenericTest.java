
package me.artiya.jiradt4j;

/**
 * Created by robot on 24/07/15.
 */
public class EverythingIsGenericTest {
    EverythingIsGeneric e = new EverythingIsGeneric() {
        public void bad(Throwable what) {

        }

        public void left(Throwable me) throws Throwable {

        }

        public void pitching(Throwable me) {

        }

        public void damn(Throwable me) {

        }

        public void overrun(Throwable me) {

        }

        public void gossip(Throwable me) {

        }
    };

    public void test() throws Throwable {
        e.bad(new Me());
        e.left(new Me());
        e.pitching(new Me());
        e.damn(new Me());
        e.overrun(new Me());
        e.gossip(new Me());
    }
}