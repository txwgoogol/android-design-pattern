### Android Design Pattern

##### 适配器模式 定义：适配器模式把一个类的接口变成客户端所期待的另一种接口，从而使原本接口不匹配而无法在一起工作的两个类能够在一起工作。  
###### [使用场景:](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/adapter/Client.java)  
 ###### `1.` 系统需要使用现有的类，而此类的接口不符合系统的需要，即接口不兼容。  
 ###### `2.` 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。  
 ###### `3.` 需要一个统一的输出接口，而输入端的类型不可预知。  

##### 外观模式 定义：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。
##### [使用场景:](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/apperarance/Client.java)  
 ###### `1.` 门面模式提供一个高层次的接口，使得子系统更易于使用。  

##### 桥接模式 定义：将抽象部分与实现部分分离，使他们都可以独立地进行变化。
##### [使用场景:](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/bridge/model/Client.java)  
###### `1.` 如果一个系统需要在构建的抽象化角色和具体化角色之间增加更多灵活性，避免在两个层次之间建立静态的继承联系。  
###### `2.` 对于那些不希望使用继承或因为多层继承导致系统类的数量急剧增加的系统。  
###### `3.` 一个类存在连个独立变化的维度，且两个维度都需要进行扩展。  

