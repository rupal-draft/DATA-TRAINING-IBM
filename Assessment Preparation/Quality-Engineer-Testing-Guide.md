# Basic Testing: Comprehensive Slide-by-Slide Explanation
## IBM Quality Engineer Testing Course - Day 1

---

## SECTION 1: OVERVIEW OF TESTING LIFECYCLE

### **Slide 1: What is a Test?**
**Definition:**
- A test is an activity in which a system or component is executed under special conditions
- Results are observed or recorded
- An evaluation is made of some aspects of the system or component

**Key Point:** Testing is not just running code; it's a systematic evaluation under controlled conditions.

---

### **Slide 2: Where Testing Fits in SDLC**

**SDLC (Software Development Life Cycle) phases:**
- Requirements Analysis
- High-Level Design
- Low-Level Design
- Coding/Build

**STLC (Software Test Life Cycle) - Parallel phases:**
- Unit Testing
- Integration Testing
- System Testing

**Critical Concept:**
- Testing runs parallel to development
- Each phase has independent development and testing activities
- Testing is not a post-development activity

---

### **Slide 3: SDLC and Verification & Validation Model**

**SDLC Phases in Detail:**

1. **Requirement Gathering:** Collect specifications and details from the client
2. **Design Stage:** Choose programming languages (Java, PHP, .NET), databases (Oracle, MySQL), define architecture and high-level functions
3. **Build Stage:** Actual coding/implementation
4. **Deployment Stage:** Deploy application to the respective environment
5. **Testing Stage:** Software testing is conducted
6. **Maintenance Stage:** Updates and changes based on customer requests

**Key Takeaway:**
- Testing is not stand-alone; it adapts to the development model
- Testing should be performed at ALL levels from requirements to maintenance
- Quality cannot be tested in at the end; it must be built in

---

### **Slide 4: Verification vs Validation Model**

**The V-Model (shown in the presentation):**

| Phase | Direction | Activity |
|-------|-----------|----------|
| **Business Requirements** | → | **Business Requirements Review** |
| **System Requirements/Design** | → | **System Requirements Review** |
| **Component Requirements & Design** | → | **Preliminary/Critical Design Review** |
| **Component Verification** | ← | **Component Test (Functional & Non-Functional)** |
| **System Verification** | ← | **System Integration Test (Functional & Non-Functional)** |
| **System Validation** | ← | **System Acceptance Test & Operability** |

**Key Difference:**
- **Verification:** Are we building the product RIGHT? (Technical correctness)
- **Validation:** Are we building the RIGHT product? (Meeting requirements)

---

### **Slide 5: Mapping Project Phases to Test Deliverables**

**Test Hierarchy:**
```
Phase                    Deliverables                Test Plans
─────────────────────────────────────────────────────────────────
Business Requirements    User Scenarios             Master Test Plan
                        System Externals            
                        Business/Product Matrix    

System Requirements     Internals, Functions       System Verification Plan
System Design          Interfaces                  Integration Feature Test Plan

Build/Code             Logic & Code               Unit Test Plan

Execute                                           Unit/Integration/System/SIT/Acceptance Testing
```

---

### **Slide 6: Documentation Hierarchy**

```
Testing Strategy or Concept (TOP)
        ↓
Master Plan for Testing
    (Serves as template for projects)
        ↓
Detail Test Plans
(Unit, Integration, System, SIT, User Acceptance)
        ↓
Test Cases
(Unit, Integration, System, Acceptance Test Cases)
```

---

### **Slide 7: Approach and Processes - Manual Testing**

**Four Key Steps for Testing:**
1. **Planning the test**
2. **Preparing the test**
3. **Test execution**
4. **Test analysis and results**

**Additional Steps:**
- Reporting the test status
- Test documentation

**Important:** All team members should understand each step and their responsibilities.

---

### **Slide 8: Test Process Management**

**Testing Process Flow:**
```
Planning → Preparation → Execution → Analysis and Reporting → Closing and Documentation
```

**Supporting Activities (Running Parallel):**
- **Quality Management**
- **Problem/Defect Management**
- **Configuration Management**
- **Change Management**

---

### **Slide 9: Main Steps/Activities in Testing**

**Sequential Order:**
1. Building up the test team
2. Planning testing activities
3. Creation of test data
4. Requirement Traceability Matrix (RTM)
5. Review test cases and test data with client
6. Development of test cases
7. Test readiness review
8. Execute testing
9. Analysis
10. Reporting
11. Closing and documentation

---

### **Slide 10: Testing Lifecycle Team Structure**

**Effective Testing Team Requirements:**
An effective testing team includes members with:
- **Testing expertise** (QA, Test Engineers, Test Managers)
- **Tools expertise** (Automation Tools, QC, Mercury Tools)
- **Database expertise** (SQL, Oracle, MySQL)
- **Domain/Technology expertise** (Industry knowledge, technical skills)

---

### **Slide 11: Test Planning**

**Typical Test Plan includes:**
- Test plan identifier
- Introduction
- Test items & features to be tested
- Features NOT to be tested
- Approach & testing strategy
- Pass/fail criteria
- Suspension & resumption criteria
- Test deliverables
- Automation scope
- Testing tasks
- Effort estimation
- Environmental needs
- Roles and responsibilities

**Test Run Plan:** Shows execution order based on:
- Functionality priority
- Unstable functionality
- Test case priority
- Customer priority
- Complexity
- Execution rate
- Dependencies

---

### **Slide 12: Test Strategy**

**Definition:**
A statement of overall approach to testing meeting business and test objectives.

**Characteristics:**
- Plan-level document prepared in requirements stage
- Identifies methods, techniques, and tools
- Can be project-specific OR organization-specific
- Critical to success
- Defines strategy upfront before actual testing

**Elements of Test Strategy:**
1. Definition of test objective
2. Strategy to meet objectives
3. Overall testing approach
4. Test environment
5. Test automation requirements
6. Metric plan
7. Risk identification & mitigation
8. Tool usage details
9. Document templates used

---

### **Slide 13: Top-Down Testing**

**Definition:**
Testing from main module to sub-module. If sub-module isn't developed, a temporary program called **Stub** simulates it.

**Advantages:**
- Good if major flaws are at top of program
- I/O functions easier to test once added
- Early skeletal program allows demonstrations

**Disadvantages:**
- Stub modules must be created (complex)
- Difficult to represent test cases before I/O functions
- Test conditions may be impossible to create
- Observation of test output is difficult
- Defers completion of certain module testing

---

### **Slide 14: Test Strategy Example**

**User Acceptance Testing in Two Cycles:**

**Cycle One:**
- Basic conditions
- Manually created data
- Converted master data (G/L accounts, cost centers)

**Cycle Two:**
- Added complexity & variations
- Manual data + specific scenarios
- Interface, enhancement, report, form, bolt-on testing (e.g., Sabrix tax package)

**Testing Artifacts:**
- Test Plan, Strategy, Execution Plan
- Test Cases & Test Data
- Execution Results & Defect Summary Report

**Testing Metrics:** Time, Coverage, Cost, Quality, Objectives

---

### **Slide 15: Test Case Design - Key Aspects**

**Process:**
1. Design tests by identifying test conditions
2. Specify test cases
3. Specify test procedures

**Definitions:**
- **Test Condition:** An item/event verifiable by test cases (function, transaction, quality characteristic)
- **Test Cases & Test Data:** Developed using test design techniques
- **Expected Results:** Outputs, data changes, states, consequences
- **Test Procedure:** Sequence of actions for execution

---

### **Slide 16: Checking Test Case Quality**

**Main Checkpoints:**
1. Whether test cases cover all features
2. Balance between normal, abnormal, boundary, and environmental cases
3. Balance between Black Box and White Box testing
4. Balance between functional and performance tests

---

### **Slide 17: What are Test Scenarios?**

**Definition:** Processes to test (e.g., testing a manual non-PO invoice against a cost center)

**Key Considerations:**
- Master data requirements (vendors, cost centers, etc.)
- Converted data (assets, cost centers, G/L accounts)
- Complexity level (which cycle to execute)
- Interfaces, enhancements, reports, forms to incorporate
- Whether variation requires new scenario

**Why Important:**
- Sets foundation for testing
- Demonstrates how system works
- Enables regression testing for future roll-outs
- Supports change requirements

---

### **Slide 18: Test Case Creation**

**Input-Process-Output Model:**
```
Input (Test Data) → Database → System Processing → Output (Test Case Results)
         ↓            ↓             ↓                    ↓
   Precondition   Further Processing            Expected Results
```

---

### **Slide 19: Test Case Description**

**Definition:** A set of conditions/variables to determine if a requirement is partially or fully satisfied.

**Key Points:**
1. At least one test case per requirement
2. Different test cases for different roles
3. Normal operation accepted
4. Works without formal requirement
5. Scripts required
6. Known input, expected output

---

### **Slide 20: Test Case Format**

**Essential Fields:**
- **Environment:** Testing environment information
- **Test Setup:** Setup outside application (printers, network, etc.)
- **Test Execution:** Detailed step-by-step execution
- **Expected Results:** What the function should do
- **Actual Results:** What actually happened
- **Status:** Pass/Fail/Not Executed/Blocked
- **Remarks:** Comments on test/execution

**Additional Fields:**
- Test Case ID, Description, Function to be tested
- Revision history, Priority, Build, Execution time

---

### **Slide 21: Test Preparation**

**Preparation Activities:**

1. **Prepare Testing Tool (Mercury QC):**
   - Attend administrator training
   - Create project & setup users
   - Load test requirements (BPML, interfaces, enhancements, reports, forms)

2. **Train Testers:**
   - Identify testers
   - Conduct training
   - Create test cases and scenarios

3. **Create Test Schedule:**
   - Identify test scenarios and document in test matrix
   - Determine test cases with variants
   - Create detailed descriptions with expected results
   - Develop test schedule and obtain approval

4. **Build Test Client:**
   - Create QA client
   - Input WMUS-specific data (test data, converted data)

---

### **Slide 22: Test Environments**

**Three Environments:**

| Environment | Purpose | Testing Level |
|-------------|---------|--------------|
| **DEV (D-System)** | Developer Environment | Unit Testing |
| **QAS (Q-System)** | Test/Quality Environment | Integration Testing (Business), User Acceptance Testing (Business) |
| **PRD (P-System)** | Production Environment | Stress Testing (IT) |

**Timeline:** DEV → QAS → PRD

---

### **Slide 23: Test Execution**

**Execution Flow:**
```
Execute Tests
    ↓
    ├─→ Test Failed → Record Defect → Implement Resolution → Re-Test
    │                      ↓
    │              Change Control Board
    │                      ↓
    │           Record Results (as needed)
    │                      ↓
    │         Update End-user Documentation
    │
    └─→ Test Passed → Record Results
```

---

### **Slide 24: Test Execution (Continued)**

**8-Step Process:**
1. Process test scenarios and test cases
2. Conduct test protocol or test report
3. Document all defects
4. Classify and prioritize defects
5. Analyze defects (IT)
6. Document all test results
7. Use defined tools (SSM)
8. Prepare reports for management

---

### **Slide 25: Analysis and Result Documentation**

**Activities:**
- Preparing test reports/logs
- Defect classification in Defect Tracking Tool
- Validation of test results by IT
- Comparison of test results vs specification
- Escalation and conflict management
- Controlling and documentation of changes

**Key Question:** Did you achieve your testing targets?

---

### **Slide 26: Test Execution - Key Points**

**Definition:** Preparation of test bed, execution of test cases, verification of results, tracking, reporting, and metrics collection.

**Testing Methods Applied:**
- **Black Box** at system testing level
- **White Box** at unit testing level
- **Top-Down/Bottom-Up** at integration testing level

**Additional Activities:**
- Several rounds based on software stability
- Regression testing whenever bugs are found and fixed
- Preparation of test reports
- Collection of metrics
- Meeting test objectives

---

### **Slide 27: Defect Workflow**

**Defect Life Cycle:**
```
New Bug/Defect
        ↓
    Assigned
        ↓
    Open
    ├─→ Duplicate (Rejected)
    ├─→ Deferred
    ├─→ Not a Bug
    │
    ├─→ Fixed
         ├─→ Pending Retest
         └─→ Retest
              ├─→ Verified
              └─→ Reopened
                    ↓
                Closed
```

---

### **Slide 28: Key Points - Testing Principles**

**Statistical Based Status:**
- Test Case: Total to run, attempts to date, success to date
- Defects by Severity: Total found, solved, open

**Specialist Roles:**
- Test case repository, design, construction
- Test execution
- Test evaluation & reporting
- Functional testers
- Environment builders

**Quote:** "*Quality cannot be tested in the very end. It must be built-in. Quality is a part of everybody's job.*"

**Testing Framework (5 Pillars):**
1. **Culture**
2. **Measurement**
3. **Methodology**
4. **Process**
5. **Skill**
6. **Organization**

**Testing Technology:**
- Test Automation
- Independent Test Team with methodology & business expertise

---

---

## SECTION 2: TYPES OF TESTING

### **Slide 29: Types of Testing**

**Major Categories:**
- Black Box & White-Box Testing
- Unit Testing
- Integration Testing
- System Testing
- System Integration Testing (SIT)
- GUI Testing
- Alpha Testing
- Beta Testing
- Benchmarking

---

### **Slide 30: Black Box vs White Box Testing**

**BLACK BOX TESTING:**
- Functional or non-functional testing
- Without reference to internal structure
- Test cases based on specification analysis
- **Example:** Gmail login page - Enter username, password, click Submit → Check if Gmail home page displays

**WHITE BOX TESTING:**
- Internal structure/design/logic known to tester
- Tester chooses inputs to exercise code paths
- Programming knowledge essential
- **Example:** Study implementation code of submit button, test boxes, check legal/illegal inputs

**Levels Applicable to White Box:**
- Unit Testing (paths within unit)
- Integration Testing (paths between units)
- System Testing (paths between subsystems)

---

### **Slide 31: Functional Testing Categories**

**Types:**

1. **Audit and Controls Testing**
   - Verifies adequacy of controls
   - Proves completeness of data processing
   - Methods: Inquiries, inspections, observations, re-performance

2. **Conversion Testing**
   - Tests compatibility of converted program/data/procedures
   - For old, deficient, or manual systems being replaced
   - Example: File, database, screen, report format conversions

3. **Documentation and Procedures Testing**
   - Ensures user documentation is helpful and accurate
   - Verifies system-user interface works and is usable
   - Done by end users
   - Conducted when system externals stabilize

4. **Error Handling Testing**
   - Tests system's exception condition detection/response
   - Ensures incorrect transactions processed properly
   - Verifies graceful termination and error logging
   - Example: Invalid input character handling

5. **Functions/Requirements Testing**
   - Verifies each business function operates per requirements
   - Black-box testing focused on output vs requirement
   - Usually completed at System Testing level

6. **Installation Testing**
   - Validates full, partial, or upgrade install/uninstall
   - Tests on different OS and hardware configurations
   - Critical for remote installations

7. **Interface/Inter-System Testing**
   - Ensures interconnections between applications work correctly
   - More complex on different platforms/locations/languages
   - Evaluates data and control passage

8. **Parallel Testing**
   - Processes same data in old AND new systems
   - Compares results
   - Ensures new version performs correctly
   - Checks consistency and data format changes
   - Example: Payroll system comparison

9. **Sanity vs Smoke Testing**
   - **Sanity:** After minor changes, confirms bugs fixed, no new issues
   - **Smoke:** After build, tests critical functionalities work before detailed testing

10. **Regression Testing**
    - Verifies no unwanted changes from making changes elsewhere
    - Run all previous tests on new version
    - Compare resulting files

11. **Transaction Flow Testing**
    - Tests path from entry to complete processing and exit
    - Example: ATM retry logic (3 attempts, card taken on 4th)

12. **Usability Testing**
    - Ensures final product is usable in practical, day-to-day fashion
    - Tests simplicity and user-friendliness
    - Part of System and UAT
    - Tests: Ease of use, learning curve, convenience

---

### **Slide 32: Structural Testing**

**Definition:** Tests technical and "housekeeping" functions; verifies system is structurally sound.

**Categories:**

1. **Backup and Recovery Testing**
   - Tests recovery after failure
   - Involves backing up to integrity-assured point
   - Re-processes transactions past failure point
   - Example: Halt machine during stand-alone time, follow recovery procedures

2. **Contingency Testing**
   - Plans for major outages/disasters
   - Critical applications need special precautions
   - Example: Overload risk, mitigation plan, contingency plan

3. **Operational Testing**
   - Tests system's operational characteristics
   - Products must perform per user requirements
   - Performance not limited to functionality
   - Example: File labeling/protection functions

4. **Job Stream Testing**
   - Part of operational testing
   - Starts early, continues through all levels
   - Checks conformance to standards
   - Example: Payroll processing with various record types

5. **Performance Testing**
   - Tests system meets desired performance levels
   - Considers response times, turn-around times
   - Can use production system or prototype
   - Example: Run times against production data volumes

6. **Security Testing**
   - Ensures protection of confidential information
   - Tests against loss, corruption, misuse
   - Testing scope depends on risk assessment
   - Example: Attempted unauthorized access testing

7. **Stress/Volume Testing**
   - Processes large transaction numbers in defined period
   - Measures performance under peak load
   - Tests multiple stress factors
   - Should not begin until functions fully tested/stable
   - Example: Large number beyond capacity, complex queries

---

### **Slide 33: Bottom-Up Testing**

**Definition:**
Testing from lowest level components upward. Temporary program called **Driver** simulates main module if not developed.

**Advantages:**
- Good if major flaws are at bottom
- Easier test condition creation
- Easier result observation

**Disadvantages:**
- Driver modules must be created
- Program doesn't exist as entity until last module added

---

---

## SECTION 3: STATIC TESTING TECHNIQUES

### **Slide 34: What are Reviews and Inspections?**

**Definition:**
- Verifying/checking for correctness against specified requirements
- Process of identifying defects in work products
- Methodical examination of software work products
- Done on both executable and non-executable products
- Identifies defects and areas needing changes
- Industry best practice

---

### **Slide 35: Why Use Reviews and Inspections?**

**Benefits:**
1. **Improve software product** & increase customer satisfaction
2. **Detect defects early** in project
3. **Enable mid-course corrections** and timely fixes
4. **Ensure correctness** regarding requirements
5. **Ensure adherence** to standards
6. **Ensure consistency** across deliverables

---

### **Slide 36: When to Conduct Reviews**

**Timing:**
- **Process:** Effective when done timely by well-versed members = minimal effort
- **Throughout Project:** From start to finish execution

---

### **Slide 37: How to Conduct Reviews**

**Two Main Methods:**
1. **Peer Review** (Informal)
2. **Formal Inspections** (Fagan's Inspection)

---

### **Slide 38: General Review Process**

**5-Step Process:**
1. **Planning**
2. **Preparation**
3. **Review**
4. **Rework**
5. **Follow-up**

---

### **Slide 39: Entry and Exit Criteria**

**Entry Criteria:** New or Revised product to be reviewed

**Review Process:**
- Reviews conducted
- Decision made

**Exit Criteria:**
- Product acceptance (As-is or with minor changes)
- Product rejection (Repeat review)

---

### **Slide 40: Tom's Story - Christmas Tree Case Study**

**Lesson 1:** Early checking saves time and effort
**Lesson 2:** Checking at source (store) saves even more time

**Translation to Software:**
- Wrong requirements → wrong design → wrong code
- Defective parts don't function together
- Importance of early reviews critical
- **Delhi Metro Example:** Lack of inspection caused collapse (deficiency in design, inadequate concrete curing)

**Contributing Factors:**
- Lack of supervision
- Compromising quality
- Bypassing inspection process

---

### **Slide 41: Myths about Reviews and Inspections**

| Myth | Reality |
|------|---------|
| Require lots of effort, increase cost | If done timely by knowledgeable members = minimal effort |
| Hard work alone ensures quality | Manual error always possible despite hard work |
| Only senior staff can conduct | Anyone well-versed about product can review |

---

### **Slide 42: Types of Reviews**

**By Review Method:**
- Peer or buddy reviews
- Facilitation reviews or inspections

**By Product Reviewed:**
- Requirement review
- Design review
- Code review
- Test Results review

**By Process:**
- Project Management reviews
- Critical Thread reviews

---

### **Slide 43: Peer Reviews vs Facilitator Reviews**

| Aspect | Peer Review | Facilitator Review |
|--------|-------------|-------------------|
| **Formality** | Informal | Formal |
| **Purpose** | Confirm understanding & check correctness | Verify artifact compliance with standards |
| **Participants** | One or more peers, joint or independent | 5-10 participants led by review leader |
| **Rigor** | Less formal | Highly structured |

---

### **Slide 44: Factors to Decide Review Type**

**Decision Factors:**
1. Work product type
2. Business criticality
3. Work product complexity

---

### **Slide 45: Peer Review Characteristics**

- Less formal verification technique
- Author initiates session
- Several peer reviews in each SDLC activity

---

### **Slide 46: Expected Results of Peer Reviews**

**Outcomes:**
1. **Agreement:** Participants agree on approaches, product, engineering practices
2. **Completeness & Correctness:** Of capabilities and features

---

### **Slide 47: Facilitation Reviews - Roles**

**Roles Involved:**
1. **Product Owner (Author)**
2. **Reviewers**
3. **SQA (Software Quality Analyst)**

---

### **Slide 48: Peer Review - Roles and Responsibilities**

**Product Owner (Author):**
- Initiates and schedules reviews
- Ensures adherence to process
- Identifies reviewers & distributes product
- Ensures rework completion
- Fills quality records

**Reviewers:**
- Review product
- Can approve product
- Document findings in "Review Summary Report"

**SQA:**
- Reviews product & communicates comments to review leader
- Tracks rework and resolution to closure
- Signs off review summary report

---

### **Slide 49: Peer Review Procedure**

**6-Step Process:**
1. **Identify Reviewer:** PM/PL identifies reviewer
2. **Review Product:** Reviewer identifies defects
3. **Discuss Defects:** Discuss defects/improvements and required corrective actions
4. **Document:** Record agreed defects in WPI form
5. **Correct:** Author corrects defects, informs readiness
6. **Verify Closure:** Reviewer checks closure of all defects

---

### **Slide 50: Project A - Peer Review Example**

**Scenario:** Lisa and Tom peer review each other's test cases using testing review checklist from Asset Library

**Process:**
- Review each other's test case designs
- Ensure defects are closed
- Use checklists for effective review

---

### **Slide 51: Simple Practical Way for Testing**

**Process Flow:**
```
Start
    ↓
Design test cases
    ↓
Check test cases (Static Testing)
    ↓
Do Static Testing based on test cases
    ↓
Do Dynamic Testing based on test cases
    ↓
Analyze data during debugging
    ↓
End
```

---

### **Slide 52: Peer Review Scenario - Example Issues**

**Common Issues Found:**
1. Spelling errors in error messages ("Error" misspelled)
2. Copy-pasted messages needing changes

---

### **Slide 53: Review of Test Cases Example**

**Test Case Format:**
- Test Suite ID
- Test Case ID
- Test Case Summary
- Related Requirement
- Prerequisites
- Steps to execute
- Test Data
- Expected Result
- Actual Result
- Status (Pass/Fail/Not Executed/Blocked)
- Remarks
- Created By/Date
- Executed By/Date
- Test Environment

**Review Comments Example:**
1. Spelling: "Recipient" not correct in summary and steps
2. Expected result should have "Should" prefix (e.g., "Email should be sent...")

---

### **Slide 54: Overview of Facilitation Reviews**

**Characteristics:**
- Most rigorous form of reviews
- Structured formal reviews
- Exit criteria for lifecycle activity

---

### **Slide 55: Characteristics of Facilitation Reviews**

1. Done by technical people FOR technical people
2. Structured, well-defined processes with defined roles
3. Reviewers prepared in advance; clarifications obtained before meeting
4. Review data recorded for monitoring effectiveness
5. Focus on identifying problems (not resolving them)

---

### **Slide 56: Fagan's Inspection/Review**

**Definition:** Structured process trying to find defects in development/testing documents (code, specifications, designs, etc.) during SDLC phases.

**Named After:** Michael Fagan (formal software inspection inventor)

**Applicable To:**
- Requirement specifications
- Software/Information System architecture
- Programming
- Software testing (test script creation)

---

### **Slide 57: Facilitation Reviews - Roles**

**Key Roles:**
1. **Author/Producer**
2. **Product Owner**
3. **Review Leader/Inspection Leader (Moderator)**
4. **Reviewers/Inspectors**
5. **Recorder**
6. **Reader**

---

### **Slide 58: Facilitation Reviews - Role Responsibilities**

**Author/Producer:**
- Distributes review material
- Provides product overview
- Provides clarifications
- Participates as inspector
- Shouldn't get defensive about identified defects

**Product Owner:**
- Initiates review process
- Identifies review leader
- Assesses readiness for review
- Identifies reviewers & distributes product
- Ensures rework completion
- Files review records

**Reader:**
- Understands material being reviewed
- Paraphrases while reading
- Sets inspection pace
- Participates as inspector

**Reviewers/Inspectors:**
- Review product & communicate comments to review leader
- Identify consolidator in absence of recorder
- At least one should be product expert

**Recorder:**
- Records review comments at meeting
- Classifies errors
- Takes confirmation on each recorded error
- Participates as inspector

**Review Leader/Inspection Leader (Moderator):**
- Manages entire process
- Skilled in leadership and communication
- Identifies reviewers, assigns roles, distributes product
- Ensures preparedness
- Controls process, generates/distributes review forms
- Participates as inspector
- Responsible for rework follow-up
- Ensures entry/exit criteria met

---

### **Slide 59: Facilitation Review Process**

**6-Step Process:**
1. **Planning**
2. **Orientation**
3. **Preparation**
4. **Review Meeting**
5. **Rework**
6. **Verify**

---

### **Slide 60: Project A - Facilitation Review Example**

**Scenario:** $1 million project requiring rigorous review

**Process:**
- Manager (Mike) initiates formal review
- Project Lead (John) is Review Leader
- Tom = Recorder, Lisa = Reader
- Clients participate for requirement accuracy

**Why Formal?** High stakes project; any requirement issues → huge problems; need client involvement

---

### **Slide 61: Facilitation vs Peer Review Comparison**

| Characteristic | Fagan's Review | Peer Review |
|---|---|---|
| **Review Leader** | Required | Not Required |
| **Recorder** | Required | Not Required |
| **Reviewers** | 5-10 including leader | 1 |
| **Advance Distribution** | Required (2+ days) | Required (2+ days) |
| **Formal Meeting** | Required | Not Required |
| **Moderation** | By review leader | By product owner |
| **Comment Consolidation** | By recorder | By product owner |
| **Recording** | WPI Form required | Not required |
| **Review Summary** | Required, by leader | Required, by owner |
| **Closure Evidence** | Leader verifies & signs | Owner completes & signs |
| **Preparation Time** | Captured | Not captured |
| **Review Time** | Captured | Captured |

---

### **Slide 62: Deciding Type of Review**

**Decision Matrix:**

**Organization Level Plans:**
- First version: **Fagan's Review**
- Revisions: **Peer Review**

**Project Level Plans/Documents/Code:**
- Complex projects: **Fagan's Review**
- Large SRS (>25 person-months): **Fagan's Review**
- Complex/Mega projects: **Fagan's OR Peer Review**
- Short-term, organic projects: **Peer Review**
- Revisions: **Peer Review**

**Testing Specific:**
- Test Strategy/Master Test Plan: **Fagan's Review**
- Test Plans: **Fagan's OR Peer Review**
- Test Specifications/Scenarios: **Fagan's OR Peer Review**
- Test Cases/Scripts: **Fagan's OR Peer Review**

---

### **Slide 63: Work Product Inspection (WPI) Form**

**Key Fields:**
- Defect Number
- Page #/Location
- WPI Type
- Defect Severity
- Detail Description
- Defect Creation Date
- Originator (who raised it)
- Assigned To
- Defect Type
- Phase Detected
- Status
- Effort Spent (S)
- Comment
- Defect Closure Date

---

### **Slide 64: Measurements and Verifications**

**Defect Classification Degrees:**
1. **Critical**
2. **High**
3. **Medium**
4. **Low**
5. **Suggestion**

**Defects Classified By:**
- Severity (High/Medium/Low)
- Type (Documentation error, logical error, etc.)
- Phase injected
- Phase detected

---

### **Slide 65: Benefits of Reviews**

1. Increase quality, increase satisfaction
2. Find errors testing cannot detect
3. **Can find 60-100% of all defects**
4. Assess/improve quality of work product, process, and review process
5. Use diversity and power of group of people
6. **Reduce rework and overall project costs**

**Cost Impact Chart:** Relative cost per defect increases from Requirements → Design → Code → Test → Production (exponentially higher in production)

---

### **Slide 66: Review Checklist - Test Case Review**

**Test Overview:**
1. Are testing objectives clearly identified?
2. Are prerequisites and related documents identified?
3. Does document describe test type(s)?
4. Does document describe target system parts to be tested?
5. For test type, does document list all relevant tests?
6. Are validation tests clearly identified?
7. Are verification tests clearly identified?
8. Are integration tests (COTS) included?
9. Is test coverage sufficient?
10. Is test plan under version control?

**Approach:**
1. Does document describe tactics for testing?
2. Are test sequences and dependencies defined?
3. Are tactics aligned with Master Test Plan?

**General:**
1. Are test instructions clear and easy to follow?
2. Is test likely to test what intended?
3. Do expected results match expectations?
4. Does every test case include expected output/results?
5. Are test cases sufficiently documented for 100% reproducibility?
6. Do test cases include verification of proper return codes?
7. Are Test Cases under version control?

---

### **Slide 67: Return on Investment (ROI)**

**ROI Model:**
- Savings based on cost avoidance from earlier defect detection

**Cost Multipliers:**
- Major defect (dev→test): **10× more** to detect and correct
- Any defect (test→field): **Additional 10×**
- Minor defect (later): **2-3× more**

**Leak Costs:**
- Code to test: **9× more**
- Test to field: **13× more**

---

### **Slide 68: Activity - Banking Software Review**

**Scenario:**
Bank's login window test (Username, Password, OK/Cancel buttons)
- Correct login/password → Display user account details
- Design and review positive and negative test cases
- Use informal and formal review process

---

---

## SECTION 4: TESTING DESIGN TECHNIQUES AND APPROACH

### **Slide 69: What is a Test Technique?**

**Purpose:**
- Select best tests
- Identify test conditions and test scenarios
- Write effective and efficient test cases

---

### **Slide 70: Categories of Test Design Techniques**

**Three Main Categories:**

```
Test Design Techniques
├── Specification-based (Functional/Black Box)
│   ├── Equivalence Partitioning
│   ├── Boundary Value Analysis
│   ├── Decision Table Testing
│   ├── Orthogonal Array Testing (OAT)
│   ├── State Transition Testing
│   └── Use Case Testing
│
├── Structure-based (Structural/White Box)
│   └── Code and Design Coverage
│
└── Experience-based
    ├── Error Guessing
    └── Exploratory Testing
```

---

### **Slide 71: Specification-Based Techniques (Black Box)**

**Characteristics:**
- Use models (informal or formal) for test case derivation
- Based on functional/non-functional requirements
- Also called Black-box techniques
- Determine whether input-operation combinations produce expected results
- **Input data is critical**
- Focus on evaluating function
- Test conditions derived from specifications

---

### **Slide 72: Structure-Based Techniques (White Box)**

**Characteristics:**
- Use information about how software is constructed
- Test cases derived from code and design
- Coverage of software can be measured
- Further test cases derived to increase coverage
- Also called White-box or Glass-box techniques

---

### **Slide 73: Experience-Based Techniques**

**Characteristics:**
- Knowledge and experience of testers, developers, users used
- Knowledge of: software, usage, environment, likely defects, distribution
- Derive test cases from experience

---

### **Slide 74: Equivalence Partitioning**

**Aims:**
1. Minimize number of test cases
2. Determine input classes with similar characteristics
3. Test classes behaving in similar way

**Definition:** Define set of valid and invalid states for input condition

**Process:**
- Divide inputs and outputs into equivalent classes
- Applicable at all testing levels

**Example - Salary Range:**
```
Tax Slabs:
- 1000-2500: No tax
- 2501-4000: 5% tax

Equivalence Classes:
- C1 (Invalid): 0-999
- C2 (Valid/No tax): 1000-2500
- C3 (Valid/5% tax): 2501-4000
```

**Advantage:** Good coverage with small number of test cases

**Disadvantage:**
- Doesn't test every input
- No guidelines for choosing inputs (heuristic-based)
- Limited focus
- Not guaranteed same treatment of all equivalence class sets

---

### **Slide 75: Boundary Value Analysis (BVA)**

**Definition:** Test values at and just beyond boundaries of input domain

**Key Concepts:**
- Variant and refinement of Equivalence Partitioning
- Also covers output conditions
- Uses <, =, > operators
- **Defects tend to lurk near boundaries**

**Process:**
- Test values at boundaries
- Test values on either side of each boundary
- Applies at all testing levels

**Example - Salary Range:**
```
C1: 0-999
C2: 1000-2500
C3: 2501-4000

BVA Test Values:
Lower boundary (1000): 999, 1000, 1001
Upper boundary (2500): 2499, 2500, 2501
```

**Advantage:**
- Good at exposing UI/input problems
- Clear test case guidelines
- Small test case set

**Disadvantage:**
- Doesn't test all possible inputs
- Doesn't test input dependencies

---

### **Slide 76: Decision Table Testing**

**Elements:**
- Table with combinations of true and false
- Each column = business rule
- For requirements with logical conditions
- At least one test case per column

**Example - Marks Results:**
```
        Rule 1  Rule 2  Rule 3
Marks   0-35    36-65   66-74
Fail     Y       N       N
Pass     N       Y       Y
1st      N       N       Y
```

---

### **Slide 77: Orthogonal Array Technique (OAT)**

**Characteristics:**
- Systematic, statistical testing approach
- 2-dimensional number arrays
- Applied in UI, system, regression, configuration testing
- Reduces test case count while maintaining coverage

**Terminology:**
- **Runs:** Number of rows = number of test cases
- **Factors:** Number of columns = max variables
- **Levels:** Max values per factor
- **Strength:** Number of columns to see each level-factor possibility

**Example - Phone Call:**
```
Factors: 4 (Call Type, Billing, Access, Status)
Levels: 3 (Local/LongDist/Intl, Collect/Caller/800, Loop/PBX/ISDN, Success/Busy/Blocked)
Runs: 81 (3^4)
```

**OAT vs Traditional:**
- **Traditional:** Many scenarios, time-consuming, high miss rate
- **OAT:** Evenly distributed, thorough, fault region coverage

---

### **Slide 78: Cause-Effect Graphing**

**Aim:** Graphical representation of inputs (causes) with outputs (effects)

**Process:**
- Brainstorm for related causes and effects
- Continue until reaching goal
- Produces non-redundant, high-yield tests

**Example:**
```
Causes: Explain, Speak, Write
Effects: Understand, Hear, Reply, Enjoy, Dislike
```

---

### **Slide 79: Error Guessing**

**Aim:** Use tester experience/intuition to postulate probable faults, design tests to expose them

**Process:**
1. Make itemized list of expected errors
2. Design test cases for these errors
3. More art than science
4. Effective with experienced testers

**Advantage:** Track defect history, list error combinations

**Disadvantage:** Depends on tester's experience and ability

---

### **Slide 80: Race Conditions**

**Aim:** Detect system attempting to perform 2+ operations simultaneously

**Process:**
- Track developer's incorrect assumptions (event sequence)
- Tests in multithreading, multiprocessing, distributed computing
- List possible race condition areas

**Advantage:** Security testing, heavy load testing

**Disadvantage:** Difficult fault detection, hacker prone

---

### **Slide 81: State Transition Testing**

**Aim:** Execute state transitions through test cases

**Process:**
1. Draw State Transition diagram
2. Determine start state, input, output, finish state
3. Determine coverage level
4. Define tests

**Terminology:**
- **State:** Condition during object life; satisfies conditions, performs actions, waits for events
- **Event:** Occurrence triggering state transition
- **Guard:** Boolean expression enabling event to cause transition
- **Transition:** Change of state
- **Action:** Actions taken in response to state change

**Example - Light Switch:**
```
Test 1:  OFF → SWITCH ON → ON (Light ON)
Test 2:  ON → SWITCH OFF → OFF (Light OFF)
Test 3:  OFF → SWITCH ON → ON (Light ON)
```

---

### **Slide 82: Test Case IEEE Standard 610 (1990)**

**Components:**
- **Test Inputs:** Known inputs
- **Execution Conditions:** Setup requirements
- **Expected Results:** What should happen
- **Aim:** Exercise particular path or verify requirement compliance

---

### **Slide 83: What is a Test Procedure?**

**Definition:**
- Detailed instructions for setup, execution, evaluation of results
- A test case may use multiple test procedures
- Specifies sequence of actions

---

---

## SECTION 5: CASE STUDY

### **Slide 84-86: Case Study - Testing Lifecycle Role Play**

**Scenario:** Requirements review activity with test cases

**Roles:**
1. **Tester:** Reviews test cases, asks clarifications, records observations, documents conversations
2. **SME:** Reads test cases, poses queries, listens to responses
3. **Observer:** Watches dialogue, documents feedback based on observations

**Read:** Test cases on pages 8-9 of case study

**Document:** Positive and negative test cases

---

---

## MCQ PREPARATION SUMMARY

### **Key Concepts to Remember:**

1. **Testing Lifecycle:** Parallel to SDLC, starts from requirements, continuous
2. **Verification vs Validation:** Verify building RIGHT (technically), Validate building right PRODUCT
3. **SDLC Phases:** Requirements → Design → Build → Deploy → Test → Maintenance
4. **Testing Levels:** Unit → Integration → System → SIT → UAT
5. **Black Box:** Functional, no internal knowledge
6. **White Box:** Structural, requires code knowledge
7. **Test Planning:** Comprehensive with strategy, approach, objectives
8. **Reviews:** Catch 60-100% defects, cost-effective early
9. **Peer Review:** Informal, 1-2 reviewers, author initiates
10. **Fagan Inspection:** Formal, 5-10 people, structured, defined roles
11. **Test Design Techniques:** Specification-based, Structure-based, Experience-based
12. **Equivalence Partitioning:** Reduce test cases with equivalence classes
13. **Boundary Value Analysis:** Test at boundaries where defects hide
14. **Defect Cost:** Increases exponentially from requirements to production
15. **Quality Quote:** "Quality must be built-in, not tested in at the end"

---

## TYPICAL MCQ PATTERNS

### **Pattern 1: When should testing start?**
- Answer: As soon as possible in development lifecycle / During design stage / When requirements documented

### **Pattern 2: What is test strategy?**
- Answer: High-level document, states approach, identifies tools/methods/techniques

### **Pattern 3: Black Box vs White Box?**
- Answer: Black Box = functional/no internal knowledge; White Box = structural/code knowledge

### **Pattern 4: Benefits of reviews?**
- Answer: Early defect detection, reduce rework, increase quality, cost-effective

### **Pattern 5: Peer vs Fagan review?**
- Answer: Peer = informal, 1-2 people; Fagan = formal, 5-10 people, structured

### **Pattern 6: Test technique for reducing test cases?**
- Answer: Equivalence Partitioning

### **Pattern 7: Test technique for boundary testing?**
- Answer: Boundary Value Analysis

### **Pattern 8: What catches 60-100% defects?**
- Answer: Reviews and Inspections

### **Pattern 9: SDLC vs STLC?**
- Answer: SDLC = development phases; STLC = testing phases running parallel

### **Pattern 10: Types of structural testing?**
- Answer: Backup/Recovery, Performance, Security, Stress, Operational, Job Stream, Contingency

---

**Good luck with your MCQs!** Focus on understanding concepts rather than memorizing facts. The presentation emphasizes practical application of testing throughout the development lifecycle.