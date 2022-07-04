package com.nbgsoftware.gbrains.di.component;

import com.nbgsoftware.gbrains.di.PerBroadcastReceiver;
import com.nbgsoftware.gbrains.di.module.BroadcastReceiverModule;

import dagger.Component;

@PerBroadcastReceiver
@Component(dependencies = ApplicationComponent.class, modules = BroadcastReceiverModule.class)
public interface BroadcastReceiverComponent {

}