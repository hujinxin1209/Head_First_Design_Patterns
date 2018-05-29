# Head-First-Design-Patterns
设计模式

**原则**
抽象、封装变化、多用组合、少用继承、针对接口编程、不针对实现编程、为交互对象之间的松耦合设计而努力、
对拓展开发，对修改关闭、
* **Strategy Pattern 策略模式**：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/duck.png)

* **Observer 观察者模式**：出版者 + 订阅者；定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知
并自动更新。
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/Observer.png)

* **Decorator 装饰者模式**: 动态的将责任附加到对象（咖啡的调料）上，想要拓展功能，装饰者提供有别于继承的另一种选择
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/Decorator.png)

* **Factory 工厂模式**：通过让子类决定该创建对象是什么，来达到将对象创建过程封装的目的。工厂方法让类把实例化推迟到子类。
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/simpleFactory.png)
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/factoryfm.png)

* **Singleton 单例模式**: 确保一个类只有一个实例，并提供全局访问点。

* **Command 命令模式**: 将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销操作。（调用者、接收者）
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/simpleCommand.png)

* **Adapter 适配器模式**: 将一个类的接口，转换成客户希望的另一个接口。适配器让原来接口不兼容的类可以合作无间。
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/adapter.png)

* **Facade外观模式**: 提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
![Image text](https://github.com/hujinxin1209/Head_First_Design_Patterns/blob/master/img/facade.png)