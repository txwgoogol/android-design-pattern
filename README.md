### Android Design Pattern

##### 适配器模式 定义：适配器模式把一个类的接口变成客户端所期待的另一种接口，从而使原本接口不匹配而无法在一起工作的两个类能够在一起工作。  
###### [使用场景](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/adapter/Client.java)
 ###### `1.` 系统需要使用现有的类，而此类的接口不符合系统的需要，即接口不兼容。  
 ###### `2.` 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。  
 ###### `3.` 需要一个统一的输出接口，而输入端的类型不可预知。  