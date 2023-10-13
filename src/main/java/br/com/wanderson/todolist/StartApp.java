package br.com.wanderson.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.wanderson.todolist.task.TaskModel;
import br.com.wanderson.todolist.utils.Utils;

@Component
public class StartApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        /* 
        TaskModel model = new TaskModel();
        var atrs = Utils.getNullPropertyNames(model);
        for (String atr: atrs) {
            System.out.println(atr);
        }
        */
    }
    
}
