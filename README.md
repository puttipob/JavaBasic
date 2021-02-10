# **Javafandamental**
Project นี้ใช้เป็น Guideline ผู้เริ่มต้นศึกษา Java และ ทบทวนความจำ (ความจำตัวเราด้วยฮ่า)
## การติดตั้ง
1. ทำการติดตั้ง JDK ที่ Link : [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. เลือก Version และ Device ที่ต้องการ Download และทำการ Install ตามปกติ
3. กำหนด Path ไฟล์ bin และ javapath สำหรับ Windows 10 โดยไปที่ 
    * Start
    * พิมพ์ว่า Edit the System enviroment variables
    * ไปที่ ปุ่ม Envieonment Variable
    * System Variable
    * Path กด Edit
    * ถ้าติดตั้งตามปกติ path จะอยู่ในลักษณะนี้
      * C:\Program Files\AdoptOpenJDK\jdk-11.0.9.101-hotspot\bin
      * C:\Program Files (x86)\Common Files\Oracle\Java\javapath
4. เช็คดูว่าเครื่องเรามี Java จริงหรือยัง
    * เปิด Command Prompt
    * พิมพ์ java -version แล้ว Enter
    * ถ้าขึ้น Version แปลว่าพร้อมใช้งานแล้ว
## Data Type in Java
1. Primitive Data Type
    * Integers
      * byte
      * short
      * int
      * long
    * Floating-Point
      * float
      * double
    * Charactor
      * char
    * Boolean
      * boolean
2. Non-primitive Data Type
    * String
    * Array
    * List
    * Set
    * Stack
    * Vector
    * Dictionary
    * All user-defined classes
    * etc   

| Data Type | คําอธิบาย           | ขนาด (Bit)         |
| --------- |:-----------------:| -------------------:|
| boolean   | ค่าทางตรรกศาสตร์ 8  | (เก็บค่า True /False) |
| byte      | ตัวเลขที่ไม่มีจุดทศนิยม | 8                   |
| short     | ตัวเลขที่ไม่มีจุดทศนิยม | 16                  |
| int       | ตัวเลขที่ไม่มีจุดทศนิยม | 32                  |
| long      | ตัวเลขที่ไม่มีจุดทศนิยม | 64                  |
| float     | ตัวเลขที่มีจุดทศนิยม   | 32                  |
| double    | ตัวเลขที่มีจุดทศนิยม   | 64                  |
| char      | ตัวอักษร            | 16                  |

| Data Type | ค่าตํ่าสุด               | ค่าสูงสุด                |
| --------- |:--------------------:| ---------------------: |
| boolean   | ค่าทางตรรกศาสตร์       | 8 (เก็บค่า True /False)  |
| byte      | -128                 | 127                    |
| short     | -32768               | 32767                  |
| int       | -2147483648          | 2147483647             |
| long      | -9223372036854775808 | 9223372036854775807    |
| float     | 1.4E-45              | 3.4028235E38           |
| double    | 4.9E-324             | 1.7976931348623157E308 |
| char      | -                    | -                      |

## Keyword in Java
1. abstract
2. assert
3. boolean
4. break
5. byte
6. case
7. catch
8. char
9. class
10. continue
11. default
12. do
13. double
14. else
15. enum
16. extends
17. final
18. finally
19. float
20. for
21. if
22. implements
23. import
24. instanceof
25. int
26. interface
27. long
28. native
29. new
30. package
31. private
32. protected
33. public
34. return
35. short
36. static
37. strictfp
38. super
39. switch
40. synchoronized
41. this
42. throw
43. throws
44. transient
45. try
46. void
47. volatile
48. while

## การแปลงชนิดข้อมูล (Type Casting)
1. Widening Casting
    * คือการแปลงข้อมูลที่มีขนาดเล็กไปสู่ข้อมูลขนาดใหญ่ (แบบอัตโนมัติ) 
    * byte -> short -> char -> int -> long -> float -> double
2. Narrowing Casting
    * คือการแปลงข้อมูลที่มีขนาดใหญไปสู่ข้อมูลที่มีขนาดเล็ก (ทําเอง)
    * double -> float -> long -> int -> char -> short -> byte

## ตัวดําเนินการ (Operator)

1. ตัวดำเนินการทางคณิตศาสตร์

| Operator | คําอธิบาย   |
| -------- |-----------|
| +        | บวก       |
| -        | ลบ        |
| *        | คูณ        |
| /        | หาร        |
| %        | หารเอาเศษ  |

2. ตัวดำเนินการเปรียบเทียบ

| Operator | คําอธิบาย     |
| -------- | ----------- |
| ==       | เท่ากับ       |
| !=       | ไม่เท่ากับ     |
| >        | มากกว่า      |
| <        | น้อยกว่า      |
| >=       | มากกว่าเท่ากับ |
| <=       | น้อยกว่าเท่ากับ |

3. ตัวดำเนินการทางตรรกศาสตร์

| Operator | คําอธิบาย |
| -------- | ------- |
| &&       | AND     |
| ||       | OR      |
| !        | NOT     |

| a     | !a    | a     | b     | a&&b  | aIIb    |
| ----- | ----- | ----- | ----- | ----- | ----- |
| true  | false | false | false | false | false |
| false | ture  | false | ture  | false | ture  |
|       |       | true  | false | false | ture  |
|       |       | true  | ture  | ture  | ture  |

4. ตัวดำเนินการทางตรรกศาสตร์

| Operator     | รูปแบบการเขียน | ความหมาย                          |
| ------------ | ------------ | --------------------------------- |
| ++ (Prefix)  | ++a          | เพิ่มค่าให้ a ก่อน 1 ค่าแล้วนําไปใช้       |
| ++ (Postfix) | a++          | นําค่าปัจจุบันใน a ไปใช้ก่อนแล้วค่อยเพิ่มค่า |
| -- (Prefix)  | --b          | ลดค่าให้ b ก่อน 1 ค่าแล้วนําไปใช้        |
| -- (Postfix) | b--          | นําค่าปัจจุบันใน b ไปใช้ก่อนแล้วค่อยลดค่า  |

5. Compound Assignment

| Assignment | รูปแบบการเขียน | ความหมาย |
| ---------- | ------------ | -------- |
| +=         | x+=y         | x=x+y    |
| -=         | x-=y         | x=x-y    |
| *=         | x*=y         | x=x*y    |
| /=         | x/=y         | x=x/y    |
| %=         | x%=y         | x=x%y    |

6.ลําดับความสำคัญของตัวดําเนินการ

| ลําดับที่ | เครื่องหมาย                  | ลําดับการทํางาน |
| ------ | ------------------------- | ------------ |
| 1      | ( )                       |              |
| 2      | ++ , --                   | ซ้ายไปขวา     |
| 3      | * , / , %                 | ซ้ายไปขวา     |
| 4      | + , -                     |ซ้ายไปขวา      |
| 5      | < , <= , > , >=           | ซ้ายไปขวา     |
| 6      | == , !=                   | ซ้ายไปขวา     |
| 7      | &&                        |ซ้ายไปขวา      |
| 8      | II                        |ซ้ายไปขวา      |
| 9      | = , += , -= , *= , /= ,%= |ขวาไปซ้าย      |

### โครงสร้างควบคุม (Control Structure)

1. แบบมีเงื่อนไข (Condition)

* รูปแบบคําสั่งแบบเงื่อนไขเดียว
``` java
if(เงื่อนไข){
  คําสั่งเมื่อเงื่อนไขเป็นจริง ;
}
``` 
* รูปแบบคําสั่งแบบ 2 เงื่อนไข
``` java
if(เงื่อนไข){
  คําสั่งเมื่อเงื่อนไขเป็นจริง ;
}else{
  คําสั่งเมื่อเงื่อนไขเป็นเท็จ ;
}
```
* ข้อควรระวังการเขียน if เพื่อตรวจสอบเงื่อนไข
``` java
if(เงื่อนไข){
  คําสั่งเมื่อเงื่อนไขเป็นจริง ;
}if(เงื่อนไข){
  คําสั่งเมื่อเงื่อนไขเป็นจริง ;
}
``` 
* รูปแบบคําสั่งแบบหลายเงื่อนไข
``` java
if(เงื่อนไขที่ 1){
  คําสั่งเมื่อเงื่อนไขที่ 1 เป็นจริง ;
}elseif(เงื่อนไขที่ 2){
  คําสั่งเมื่อเงื่อนไขที่ 2 เป็นจริง ;
}elseif(เงื่อนไขที่ 3){
  คําสั่งเมื่อเงื่อนไขที่ 3 เป็นจริง ;
}else{
  คําสั่งเมื่อทุกเงื่อนไขเป็นเท็จ ;
}
``` 
* if..else แบบลดรูป (Ternary Operator)
``` java
ตัวแปร = (เงื่อนไข) ? คําสั่งเมื่อเงื่อนไขเป็นจริง : คําสั่งเมื่อเงื่อนไขเป็นเท็จ;
``` 
* การเขียน if ซ้อน if
``` java
if(เงื่อนไขที่ 1){
  if(เงื่อนไขที่ 2 ){
    คําสั่งเมื่อเงื่อนไขที่ 2 เป็นจริง ;
  }
}
``` 
* Switch..Case
``` java
switch(สิ่งที่ต้องการตรวจสอบ) {
  case ค่าที่ 1 : คําสั่งที่ 1;
    break;
  case ค่าที่ 2 : คําสั่งที่ 2;
    break;
  case ค่าที่ N : คําสั่งที่ N;
    break;
  default : คําสั่งเมื่อไม่มีค่าที่ตรงกับที่ระบุใน case
}
``` 

2.แบบทําซํ้า (Loop)

* While Loop
``` java
while(เงื่อนไข){
  คําสั่งที่จะทําซ˵าเมื่อเงื่อนไขเป็นจริง ;
}
``` 
* For Loop
``` java
for(ค่าเริ่มต้นของตัวแปร; เงื่อนไข; เปลี่ยนแปลงค่าตัวแปร) {
  คําสั่งเมื่อเงื่อนไขเป็นจริง;
}
``` 
* For Loop
``` java
while(เงื่อนไข){
  คําสั่งที่จะทําซ˵าเมื่อเงื่อนไขเป็นจริง ;
}
``` 
* Do While
``` java
do {
  คําสั่งต่างๆ เมื่อเงื่อนไขเป็นจริง;
} while(เงื่อนไข);
``` 

* ข้อแตกต่างและการใช้งาน Loop
  * For ใช้ในกรณีรู้จํานวนรอบที่ชัดเจน
  * While ใช้ในกรณีที่ไม่รู้จํานวนรอบ
  * Do..while ใช้ในกรณีที่อยากให้ลองทําก่อน 1 รอบ แล้วทําซํ้าไปเรื่อยๆทราบเท่าที่เงื่อนไขเป็นจริง
  
  
## Array

#### คุณสมบัติของ Array

1. ใช้เก็บกลุ่มของข้อมูล
2. ข้อมูลที่อยู่ในอาร์เรย์จะเรียกว่าสมาชิก หรือ อิลิเมนต์ (element)
3. แต่ละอิลิเมนต์ (element) จะเก็บค่าข้อมูล (value) และอินเด็กซ์ (Index) เอาไว้
4. Index หมายถึงคีย์ของอาร์เรย์ใช้อ้างอิงตําแหน่งของ element เริ่มต้นที่ 0
5. สมาชิกใน array ต้องมีชนิดข้อมูลเหมือนกัน
6. สมาชิกใน array จะถูกคั่นด้วยเครื่องหมาย comma

#### การสร้าง Array แบบ Primitive Data Type
``` java
int[] number = {10, 20, 30, 40};
/**
การเข้าถึงสมาชิก
10 เท่ากับ index ที่ 0 
20 เท่ากับ index ที่ 1 
30 เท่ากับ index ที่ 2 
40 เท่ากับ index ที่ 3 
*/

String [] animals = {"หมู","หมา","กา","ไก่"};
/**
การเข้าถึงสมาชิก
หมู เท่ากับ index ที่ 0 
หมา เท่ากับ index ที่ 1 
กา เท่ากับ index ที่ 2 
ไก่ เท่ากับ index ที่ 3 
*/
```
#### การเข้าถึง Array

* การเข้าถึงสมาชิกด้วย For Loop
``` java
String [] animals = {"หมู","หมา","กา","ไก่"};
for (int i = 0; i < pets.length; i++) {
   System.out.println(pets[i]);
}
```
* การเข้าถึงสมาชิกด้วย ForEach
``` java
String [] pets = {“แมว”,”กระต่าย”};
for (String name : pets) {
   System.out.println(name);
}
```
#### คุณสมบัติของ Array
* Array 2 มิติ
``` java
ชนิดข้อมูล [][] ชื่อตัวแปร = {
   {Array คอลัมน์ที่ 0 แถวที่ 0, Array คอลัมน์ที่ 1 แถวที่ 0, Array คอลัมน์ที่ 2 แถวที่ 0,},
   {Array คอลัมน์ที่ 0 แถวที่ 1, Array คอลัมน์ที่ 1 แถวที่ 1, Array คอลัมน์ที่ 2 แถวที่ 1,},
   {Array คอลัมน์ที่ 0 แถวที่ 2, Array คอลัมน์ที่ 1 แถวที่ 2, Array คอลัมน์ที่ 2 แถวที่ 2,}
}
```
* การเข้าถึงข้อมูลใน Array 2 มิติ
   * ชื่อตัวแปร [เลขแถว][เลขคอลัมน์];
   * เช่น products [0][1];

* การเข้าถึงข้อมูลด้วย Loop
``` java
for (int rows = 0; rows < products.length; rows++) {
   for(int column = 0; column < products[rows].length; column++) {
      System.out.println(products[rows][column]);
   }
}
```
## Method
1. เมธอด (Method) คืออะไร 
   * ชุดคําสั่งที่นํามาเขียนรวมกันเป็นกลุ่มเพื่อให้เรียกใช้งานตามวัตถุประสงค์ที่ต้องการ และลดความซํ้าซ้อนของคําสั่งที่ใช้งานบ่อยๆ เมธอดสามารถนําไปใช้งานได้ทุกที่และแก้ไขได้ในภายหลัง ทําให้โค้ดในโปรแกรมมีระเบียบและใช้งานได้สะดวกมากยิ่งขึ้น
   
2. การเข้าถึงข้อมูลด้วย Loop

``` java
type name ( parameter1, parameter2, ... ) {
   statements
}
access_modifier type name ( parameter1, parameter2, ... ) {
   statements
}
```
3. รูปแบบของเมธอด

* เมธอดที่ไม่มีการรับและส่งค่า
``` java
modifier void ชื่อเมธอด(){
   // คําสั่งต่างๆ
}
// การเรียกใช้งานเมธอด
ชื่อเมธอด ();
```
* เมธอดที่มีการรับค่าเข้ามาทํางาน
``` java
modifier void ชื่อเมธอด(parameter1,parameter2,.....){
   // กลุ่มคําสั่งต่างๆ
}
/**
อาร์กิวเมนต์ คือ ตัวแปรหรือค่าที่ต้องการส่งมาให้กับเมธอด (ตัวแปรส่ง)
พารามิเตอร์ คือ ตัวแปรที่เมธอดสร้างไว้สําหรับรับค่าที่จะส่งเข้ามาให้กับเมธอด (ตัวแปรรับ)
*/

//การเรียกใช้งานเมธอด
ชื่อเมธอด (argument1,argument2,.....);
```
* เมธอดที่มีส่งค่าออกมา
``` java
modifier type ชื่อเมธอด(){
   return ค่าที่จะส่งออกไป (type)
}
```
* เมธอดที่มีการรับค่าเข้ามาและส่งค่าออกไป
``` java
modifier type ชื่อเมธอด(parameter1,parameter2,.....){
   retrun ค่าที่จะส่งออกไป
}
```
4.Method Array

* เมธอดที่รับค่า Array
``` java
modifier void ชื่อเมธอด (type [] arr){
   // คําสั่งต่างๆ
}
```
* เมธอดที่รับค่า Array และคืนค่าออกไป 
``` java
modifier type [] ชื่อเมธอด (type [] arr){
   // คําสั่งต่างๆ
}
```
* เมธอดที่รับค่า Array และคืนค่า Array
``` java
modifier []type ชื่อเมธอด (type [] arr){
   // คําสั่งต่างๆ
   return []
}
```
* Variable Arguments(var-args)
``` java
modifier []type ชื่อเมธอด (type [] arr){
   // คําสั่งต่างๆ
   return []
}
```

## Exception

* การที่โปรแกรมทํางานบางอย่างแต่เกิดข้อผิดพลาดขึ้นแล้วโปรแกรมไม่สามารถจัดการข้อผิดพลาดนั้นได้ ซึ่งทําให้เกิดสิ่งผิดปกติหรือ Exception ส่งผลทําให้โปรแกรมหยุดทํางาน

1. ตัวอย่าง Exception
   * ArrayIndexOutOfBoundsException
   * ArithmeticException
   * ZeroDivisionException
   * IOException
   * FileNotFoundException
   * อื่นๆ

2. จัดการ Exception ด้วย Try...Catch
``` java
try{
   // ลองทําคําสั่งในนี้
}catch(Exception e){
   // ถ้าเกิดข้อผิดพลาดจะมาทําตรงส่วนนี้
}
```
2. Try...Catch แบบหลายเหตุการณ์
``` java
try {
   // ลองทําคําสั่งในนี้
} catch (ExceptionType1 e1) {
   // ถ้าเกิดข้อผิดพลาดที่ 1 จะมาทําตรงส่วนนี้
} catch (ExceptionType2 e2) {
   // ถ้าเกิดข้อผิดพลาดที่ 2 จะมาทําตรงส่วนนี้
}
```
3. Finally
* เมื่อเกิดข้อผิดพลาด หรือ ไม่เกิด ก็จะทํางานคําสั่งในส่วนนี้ทุกครั้งคําสั่งที่ระบุมักจะเป็นคําสั่งที่ทํางานส่วนที่สําคัญของโปรแกรม เช่น ปิดไฟล์ ปิดการเชื่อมต่อฐานข้อมูล หรือ คําสั่ง Disconnect กับ Server
``` java
try{
   // ลองทําคําสั่งในนี้
}catch(Exception e){
   // ถ้าเกิดข้อผิดพลาดจะมาทําตรงส่วนนี้
}finally {
   // คําสั่งต่างๆ
}
```
4. จัดการ Exception ด้วย Throw
``` java
if (age <=20) {
   throw new ArithmeticException("ตัวเลขไม่ถูกต้อง");
}
```
5. จัดการ Exception ด้วย Throw
``` java
function setAge(int age) throws ArithmeticException , IOException {
   if (age <=20) {
      throw new ArithmeticException("ตัวเลขไม่ถูกต้อง");
   }
}
```
6. การสร้าง Exception ขึ้นมาใช้เอง
``` java
if (age <= 20) {
   throw new Exception("อายุไม่ถึงเกณฑ์");
}
```

## **Object Oriented Programming**

#### **แนวความคิดภาษาเชิงวัตถุ**
##### การพัฒนาโปรแกรมที่ใช้วัตถุเป็นเครื่องมือโดยที่วัตถุนั้นมีลักษณะพื้นฐานดังนี้
   * คลาส (Class) & วัตถุ (Object)
   * การห่อหุ้ม (Encapsulation)
   * การสืบทอดคุณสมบัติ (Inheritance)
   * การพ้องรูป (Polymorphism)
   
1. **คลาส (class)** 
   * คือ ต้นแบบของวัตถุ การจะสร้างวัตถุขึ้นมาอย่างหนึ่งจะต้อง สร้างคลาสขึ้นมาเป็นโครงสร้างต้นแบบสําหรับวัตถุก่อนเสมอ 
2. **วัตถุหรือออบเจ็ค (object)** 
   * คือ สิ่งที่ประกอบไปด้วยคุณสมบัติ 2 ประการ คือคุณลักษณะ และพฤติกรรม
3. **คุณลักษณะ (attribute หรือ data member)** 
   * คือ สิ่งที่บ่งบอกลักษณะทั่วไปของวัตถุ
4. **พฤติกรรม (behavior หรือ method)** 
   * คือ พฤติกรรมทั่วไปขอวัตถุที่สามารถกระทําได้
5. **Access Modifier**  
   * คือ ระดับในการเข้าถึง Class, Attribute, Method และอื่น ๆ ในภาษาเชิงวัตถุ โดยมีประโยชน์อย่างมากในเรื่องของการกําหนดระดับการเข้าถึง สิทธิในการเข้าใช้งาน การซ้อนข้อมูล และอื่น ๆ
6. **Public** 
   * เป็นการประกาศระดับการเข้าถึงที่เข้มงวดน้อยที่สุด หรือกล่าวได้ว่าใครๆก็สามารถเข้าถึงและเรียกใช้งานได้
7. **Protected**  
   * เป็นการประกาศระดับการเข้าถึงที่เกี่ยวข้องกับเรื่องการสืบทอด(Inheritance) คลาสที่อยู่ในแพ็กเกจเดียวกันกับคลาสที่ถูกกําหนด modifier เป็น protected จะสามารถเรียกใช้งานสมาชิกของคลาสที่ถูกกําหนดเป็น protected ได้ 
8. **Private** 
   * เป็นการประกาศระดับการเข้าถึงที่เข้มงวดที่สุด กล่าวคือ จะมีแต่คลาสของ ตัวมันเองเท่านั้นที่มีสิทธิ์ใช้งานได้ 

* **การห่อหุ้ม(Encapsulation)**
   * เป็นกระบวนการซ่อนรายละเอียดการทํางานและข้อมูลไว้ภายในไม่ให้ภายนอกสามารถมองเห็นได้
   * ทําให้ภายนอกไม่สามารถทําการเปลี่ยนแปลงแก้ไขข้อมูลภายในได้ซึ่งเป็นผลทําให้เกิดความเสียหายแก้ข้อมูล
   * ข้อดีของการห่อหุ้มคือสามารถสร้างความปลอดภัยให้แก้ข้อมูลได้เนื่องจากข้อมูลจะถูกเข้าถึงจากผูกมีสิทธิ์เท่านั้น

* **การสืบทอดคุณสมบัติ (Inheritance)**
   * หลักการของ inheritance คือ ทําการสร้าาสิ่งใหม่ขึ้นด้วยการสืบทอด หรือรับเอา (inherit) คุณสมบัติบางอย่างมาจากสิ่งเดิมที่มีอยู่แล้ว โดยการสร้าางเพิ่มเติมจากสิ่งที่มีอยู่แล้วได้เลย ข้อดีของการ inheritance คือ จากการที่สามารถนําสิ่งที่เคยสร้างขึ้นแล้วนํากลับมาใช้ใหม่ (re-use) ได้ ทําให้ช่วยประหยัดเวลาการทํางานลง เนื่องจากไม่ต้องเÿียเวลาพัฒนาใหม่หมด 

* **คีย์เวิร์ด THIS & SUPER**
   * **คีย์เวิร์ด this** การใช้คีย์เวิร์ด this คือ เมื่อต้องการเรียกใช้งานคอนสตรัคเตอร์อื่นๆ ที่อยู่ภายในคลาสเดียวกัน
   * **คีย์เวิร์ด super** เมื่อต้องการเรียกคอนสตรัคเตอร์ของคลาสแม่ให้ทํางาน คีย์เวิร์ด super ในการเรียกใช้งานคอนสตรัคเตอร์ของคลาสแม่จะต้องทํา การเรียกที่บรรทัดแรกสุดของคอนสตรัคเตอร์นั้นๆ เท่านั้น

* **การพ้องรูป (POLYMORPHISM)**
   * Polymorphism เกิดจาก poly (หลากหลาย) + morphology (รูปแบบ) ในทางโปรแกรมคือการที่เมธอดชื่อเดียวกัน สามารถรับอาร์กิวเมนต์ที่แตก ต่างกันได้หลายรูปแบบ โดยเมธอดนี้จะถูกเรียกว่า overload method (เมธ
อดถูกโอเวอร์โหลด

* **OVERLOADING & OVERRIDING METHOD**
   * Overloading method คือ เมธอดที่มีชื่อเหมือนกัน และอยู่ภายในคลาส เดียวกัน สิ่งที่แยกความแตกต่างของเมธอดที่เป็น overload method คือ พารามิเตอร์ (เป็นผลมาจากคุณสมบัติ OO คือ polymorphism)
   * Overriding method คือ เมธอดของคลาสลูก (subclass) ที่มีชื่อเหมือนกับเมธอดของคลาสแม่ (superclass) (เป็นผลมาจากคุณสมบัติ OO คือ inheritance) 
   
* **Constructor** เป็น Method พิเศษที่จะถูกสั่งให้ทํางานโดยอัตโนมัติ เมื่อมีการ สร้างวัตถุขึ้น เพื่อกําหนดค่าเริ่มต้นให้กับตัวแปรคลาสของวัตถุ
   * มีชื่อเหมือนกับชื่อคลาส
   * Method มีการคืนค่ากลับ แต่ Constructor ไม่มีการคืนค่ากลับ
   * ประกาศการเข้าถึงเป็นแบบ public

* **Non-access modifier: static**
   * ใช้กําหนดหน้า Method หรือตัวแปรเพื่อให้เป็นแบบ static
   * การกําหนดให้ method เป็น static เรียกว่า static method จะทําให้เราสามารถ เรียกใช้งาน method นั้นโดยไม่ต้องสร้างออปเจ็ค
   * การกําหนดให้ข้อมูลเป็น static เรียกว่า static attribute จะทําให้เราสามารถ เรียกใช้งานโดยไม่ต้องสร้างออปเจ็คขึ้นมาก่อน

* **Inheritance** การนิยามคลาสใหม่จากรูปแบบของคลาสที่มีอยู่แล้ว โดยคลาสใหม่จะนํา attribute และ method ของคลาสเดิมมาใช้ได้
  * สามารถนําโปรแกรมเดิมมาพัฒนาเพิ่มเติมใหม่ได้ง่ายขึ้น (re-use) ประหยัดเวลา
  * ทําให้โปรแกรมแต่ละโปรแกรมมีขนาดเล็ก ซึ่งทําให้ง่ายต่อการเข้าใจและปรับปรุงแก้ไข
  * ส่งผลให้เกิด Overriding method คือ เมธอดของคลาสลูก (subclass) ที่มีชื่อเหมือนกับเมธอดของคลาสแม่ (superclass)
  
* **modifier: final**
   * final เป็นคีย์เวิร์ดหนึ่งในภาษาจาวา สามารถที่จะกําหนดคีย์เวิร์ด final นี้ให้กับ class , method , attribute
   * final ให้คลาส จะทําให้คลาสนั้นไม่สามารถมี subclass ได้
   * final ให้เมธอด จะทําให้เมธอดนั้นไม่สามารถ override method นั้นได้ final ให้ data หรือ attribute จะทําให้เป็นค่าคงที่ (constant) 
   
* **การโอเวอร์โหลดเมธอด (Method overloading)** 
   * เป็นการนิยามคลาสที่ ประกอบด้วยเมธอดหลายเมธอดที่มีชื่อเหมือนกันจะต้องมีหน้าที่เหมือนกันแต่ต่างกันในส่วนของรายการพารามิเตอร์

* **การโอเวอร์ไรดิ้งเมธอด (Method Overriding)** 
   * เป็นการกําหนดการทํา งานให้กับเมธอดที่สืบทอด มาจากการถ่ายทอดคุณสมบัติ(Inheritance)

* **Abstract Class**
   * **abstract** เป็นคีย์เวิร์ดในภาษาจาวา สามารถกําหนดคีย์เวิร์ด abstract นี้ให้กับ คลาส หรือเมธอด ก็ได้
   * **abstract method** คือ เมธอดว่างเปล่าที่ยังไม่ได้มีการกําหนดรายละเอียดการทํางานลงไป จะถูกกําหนดรายละเอียดลงไปภายหลัง โดยคลาสลูกที่ได้รับการสืบทอดจากคลาสของabstract method เหล่านั้น 

* **Abstract Method**
   * abstract class หากคลาสใดก็แล้วแต่ที่ประกอบไปด้วยเมธอดที่เป็น abstract method เพียงเมธอดเดียว จะต้องประกาศคลาสนั้นเป็น abstract ด้วย
   * กฎของ abstract หากคลาสใดสืบทอดมาจาก abstract class คลาสนั้น จะต้องทําการระบุเมธอดทุกเมธอดที่เป็น abstract method ใน abstract class ไว้เสมอ (ไม่กําหนดรายละเอียดก็ได้แต่จะต้องมีการเขียน abstract method ทุกเมธอดลงไปในคลาสนั้นด้วย) 
   
* **อินเทอร์เฟซ (Interface)**
   * interface มีหลักการคล้ายกับ abstract class คือ สร้างอินเทอร์เฟซ ขึ้นมาก็เพื่อกําหนดโครงสร้างของเมธอดที่จําเป็นใช้งานขึ้นมาแต่ยังไม่ได้กําหนดรายละเอียดการทํางานใดๆ ลงไปให้กับเมธอดนั้น (abstract method)เมธอดในอินเทอร์เฟซจึงเป็นเมธอดที่ว่างเปล่า ซึ่งในภายหลังจึง มีการกําหนดรายละเอียดของเมธอดเหล่านั้นลงไป โดยถูกกําหนดโดยคลาสที่เรียกใช้อินเทอร์เฟซนั้นๆ
   
* **Interface กับ Abstract class ต่างกันอย่างไร**
   * เมธอดใน abstract class ไม่เป็น abstract method ก็ได้แต่เมธอดทุกเมธอดใน interface เป็น abstract method
   * คลาสที่จะเรียกใช้งาน abstract method ใน abstract class จะ ต้องสืบทอดคุณสมบัติไปจาก abstract class นั้น แล้วจึงทําการ สร้างเมธอดของตัวเองขึ้นมาให้มีชื่อเดียวกับ abstract method ใน abstract class โดยกําหนดรายละเอียดการทํางานให้กับ abstract method เหล่านั้นตามต้องการ
   * แต่คลาสที่จะเรียกใช้งานเมธอดในอินเทอร์เฟซไม่จําเป็นต้องมีค วามสัมพันธ์ใดๆ กับอินเทอร์เฟซทั้งสิ้น

















