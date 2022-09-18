
package me.artiya.jiradt4j;


/**
 * อะไรที่เกิดขึ้นกับเรา ณ ตอนนี้
 * ให้ถือว่า 'ธรรมดา'
 * เลวร้ายแค่ไหน 'ก็เรื่องธรรมดา'
 * ถูกทิ้ง ก็ 'ธรรมดา'
 * ถูกขว้าง ก็ 'ธรรมดา'
 * ถูกด่า ก็ 'ธรรมดา'
 * ถูกย่ำยี ก็ 'ธรรมดา'
 * ยิ่งถูกนินทา ยิ่ง 'ธรรมดามาก'
 * อะไรที่เกิดขึ้นกับเราแล้ว
 * ให้ถือว่า 'ธรรมดา'
 * Created by robot on 24/07/15.
 */
public interface EverythingIsGeneric<T extends Throwable> {
    void bad(T what);

    void left(T me) throws T;
