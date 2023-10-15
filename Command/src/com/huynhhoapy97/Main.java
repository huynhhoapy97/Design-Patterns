package com.huynhhoapy97;

import com.huynhhoapy97.commands.CloseFileCommand;
import com.huynhhoapy97.commands.Command;
import com.huynhhoapy97.commands.OpenFileCommand;
import com.huynhhoapy97.enums.SystemType;
import com.huynhhoapy97.factories.SystemFactory;
import com.huynhhoapy97.invokes.FileInvoke;
import com.huynhhoapy97.receivers.System;

public class Main {
    public static void main(String[] args) {
        System system = SystemFactory.createSystem(SystemType.WINDOWS);

        Command openFileCommand = new OpenFileCommand(system);
        Command closeFileCommand = new CloseFileCommand(system);

        FileInvoke fileInvoke = new FileInvoke(openFileCommand);
        fileInvoke.execute();

        fileInvoke = new FileInvoke(closeFileCommand);
        fileInvoke.execute();
    }
}
