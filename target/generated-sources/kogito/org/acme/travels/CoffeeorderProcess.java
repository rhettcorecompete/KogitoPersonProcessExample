package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@org.springframework.stereotype.Component("coffeeorder")
public class CoffeeorderProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.CoffeeorderModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    public CoffeeorderProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public CoffeeorderProcess() {
    }

    @Override()
    public org.acme.travels.CoffeeorderProcessInstance createInstance(org.acme.travels.CoffeeorderModel value) {
        return new org.acme.travels.CoffeeorderProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.CoffeeorderProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.CoffeeorderModel value) {
        return new org.acme.travels.CoffeeorderProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.CoffeeorderModel createModel() {
        return new org.acme.travels.CoffeeorderModel();
    }

    public org.acme.travels.CoffeeorderProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.CoffeeorderModel) value);
    }

    public org.acme.travels.CoffeeorderProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.CoffeeorderModel) value);
    }

    public org.acme.travels.CoffeeorderProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.CoffeeorderProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.CoffeeorderProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.CoffeeorderProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("coffeeorder");
        factory.variable("coffee", new ObjectDataType("org.acme.travels.Coffee"), "customTags", null);
        factory.name("coffeeorder");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("org.acme.travels.Coffee");
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode1 = factory.ruleSetNode(1);
        ruleSetNode1.name("check coffee");
        ruleSetNode1.inMapping("coffee", "coffee");
        ruleSetNode1.outMapping("coffee", "coffee");
        ruleSetNode1.ruleFlowGroup("coffee", () -> {
            return org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession", app.config().get(org.kie.kogito.rules.RuleConfig.class));
        });
        ruleSetNode1.metaData("UniqueId", "_D4C8754A-2784-4526-A151-6028FB848964");
        ruleSetNode1.metaData("elementname", "check coffee");
        ruleSetNode1.metaData("x", 349);
        ruleSetNode1.metaData("width", 154);
        ruleSetNode1.metaData("y", 49);
        ruleSetNode1.metaData("height", 102);
        ruleSetNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("Coffee Ready");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_4F302F86-08E3-4806-A38A-00CBB7EB64CE");
        endNode2.metaData("elementname", "Coffee Ready");
        endNode2.metaData("x", 656);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 170);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Coffee Desire");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_A7E93C7B-3851-44CA-9C1D-9E113B90C6A1");
        startNode3.metaData("elementname", "Coffee Desire");
        startNode3.metaData("x", 112);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 149);
        startNode3.metaData("height", 56);
        startNode3.done();
        factory.connection(3, 1, "_A23D3A02-CA12-4FC4-922C-D3A9A5A96292");
        factory.connection(1, 2, "_5F85F960-7232-4F93-A2E8-620A61C902EF");
        factory.validate();
        return factory.getProcess();
    }
}
