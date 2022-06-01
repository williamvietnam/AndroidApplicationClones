package com.nbgsoftware.gbrains.utils.rx;

import io.reactivex.rxjava3.core.Scheduler;

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
