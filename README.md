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

##### Builder模式   抽象Builder类  
##### [使用场景](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/builder/Client.java)  
###### `1.` 相同的方法，不同的执行顺序，产生不同的时间结果。  
###### `2.` 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果不相同。  
###### `3.` 产品类非常复杂，或者产品类中的调用顺序不同产生不同的作用。  
###### `4.` 当初始化一个特别复杂，如参数过多，却很多参数都有默认值时。  
###### 优点：  
###### `1.` 良好的封装性，使用建造者可以是客户端不必知道产品内部组成的细节。  
###### `2.` 建造者独立，容易拓展。  
###### 缺点：产生多余的Builder对象以及Director对象，消耗内存。  

##### 责任链模式  
##### [使用场景](https://github.com/txwgoogol/android-design-pattern/blob/master/app/src/test/java/com/txw/designpattern/chain/Client.java)    
###### 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定。  
###### 在请求处理者不明确的情况下向多个对象中的一个提交一个请求。  
###### 需要动态指定一组对象处理请求。  
###### 优点：  
###### 对请求者和处理者关系解耦，提高代码灵活性  
###### 缺点：  
###### 对链中请求遍历过多影响性能，特别是递归。  

##### 组合模式 定义：将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
###### `1.` 表示对象的部分-整体层次结构，从一个整体中能够独立出来部分模块或功能的场景
###### `2.` 抽象跟节点