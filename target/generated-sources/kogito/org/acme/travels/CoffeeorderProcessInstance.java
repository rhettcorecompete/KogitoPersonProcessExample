package org.acme.travels;

public class CoffeeorderProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<CoffeeorderModel> {

    public CoffeeorderProcessInstance(org.acme.travels.CoffeeorderProcess process, CoffeeorderModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public CoffeeorderProcessInstance(org.acme.travels.CoffeeorderProcess process, CoffeeorderModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public CoffeeorderProcessInstance(org.acme.travels.CoffeeorderProcess process, CoffeeorderModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public CoffeeorderProcessInstance(org.acme.travels.CoffeeorderProcess process, CoffeeorderModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(CoffeeorderModel variables) {
        return variables.toMap();
    }

    protected void unbind(CoffeeorderModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
