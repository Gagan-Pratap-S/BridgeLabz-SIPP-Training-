import java.util.LinkedList;

// 1. Interface: WorkflowStep defines a step
interface WorkflowStep {
    String getName();
    void execute();
}

// 2. Concrete Implementations of WorkflowStep (Polymorphism)

class ValidationStep implements WorkflowStep {
    private String documentId;

    public ValidationStep(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String getName() {
        return "Validation Step";
    }
    

    @Override
    public void execute() {
        System.out.println("Executing " + getName() + " for document: " + documentId);
    }
}

class ReviewStep implements WorkflowStep {
    private String documentId;

    public ReviewStep(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String getName() {
        return "Review Step";
    }

    @Override
    public void execute() {
        System.out.println("Executing " + getName() + " for document: " + documentId);
    }
}

class ApprovalStep implements WorkflowStep {
    private String documentId;

    public ApprovalStep(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String getName() {
        return "Approval Step";
    }

    @Override
    public void execute() {
        System.out.println("Executing " + getName() + " for document: " + documentId);
    }
}

// 3. Workflow Engine (Abstraction & Encapsulation)
class DocumentWorkflowEngine {
    private LinkedList<WorkflowStep> steps;
    private String workflowName;

    public DocumentWorkflowEngine(String workflowName) {
        this.workflowName = workflowName;
        this.steps = new LinkedList<>();
    }

    // Method to add a step (dynamic insertion)
    public void addStep(WorkflowStep step) {
        steps.add(step);
    }

    // Method to execute the workflow
    public void startWorkflow() {
        System.out.println("\n--- Starting Workflow: " + workflowName + " ---");
        if (steps.isEmpty()) {
            System.out.println("No steps defined for this workflow.");
            return;
        }
        for (WorkflowStep step : steps) {
            step.execute(); // Polymorphic call
        }
        System.out.println("--- Workflow: " + workflowName + " Completed ---\n");
    }
}

public class WorkFlowEngine {
    public static void main(String[] args) {
        String documentId = "DOC-XYZ-789";

        // Create a workflow engine
        DocumentWorkflowEngine documentWorkflow = new DocumentWorkflowEngine("Concise Document Approval Process");

        // Add steps dynamically
        documentWorkflow.addStep(new ValidationStep(documentId));
        documentWorkflow.addStep(new ReviewStep(documentId));
        documentWorkflow.addStep(new ApprovalStep(documentId));

        // Start the workflow
        documentWorkflow.startWorkflow();

        // Demonstrate another simpler workflow
        DocumentWorkflowEngine simpleWorkflow = new DocumentWorkflowEngine("Quick Review Process");
        simpleWorkflow.addStep(new ReviewStep("DOC-123-ABC"));
        simpleWorkflow.addStep(new ApprovalStep("DOC-123-ABC"));
        simpleWorkflow.startWorkflow();
    }
}