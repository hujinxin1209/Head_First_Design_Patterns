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