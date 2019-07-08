package com.chengzi.designpatterns.behavioral_Patterns.state_pattern;

/**
 * "https://www.runoob.com/design-pattern/state-pattern.html"
 */
public class StatePatternDemo {

    //使用场景：1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
    //
    //注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);

        State pauseState = new PauseState();
        pauseState.doAction(context);

        State stopState = new StopState();
        stopState.doAction(context);

    }
}
