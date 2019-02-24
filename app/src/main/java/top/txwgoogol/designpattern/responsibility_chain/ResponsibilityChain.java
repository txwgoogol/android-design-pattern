package top.txwgoogol.designpattern.responsibility_chain;

/**
 * 责任链模式
 * 使用场景
 * 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定。
 * 在请求处理者不明确的情况下向多个对象中的一个提交一个请求。
 * 需要动态指定一组对象处理请求
 * 优点：
 * 对请求者和处理者关系解耦，提高代码灵活性
 * 缺点：
 * 对链中请求遍历过多影响性能，特别是递归。
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public class ResponsibilityChain {
}
