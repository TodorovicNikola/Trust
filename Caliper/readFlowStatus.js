'use strict';

const { WorkloadModuleBase } = require('@hyperledger/caliper-core');

class MyWorkload extends WorkloadModuleBase {
    constructor() {
        super();
    }

    async initializeWorkloadModule(workerIndex, totalWorkers, roundIndex, roundArguments, sutAdapter, sutContext) {
        await super.initializeWorkloadModule(workerIndex, totalWorkers, roundIndex, roundArguments, sutAdapter, sutContext);

        for (let i=0; i<this.roundArguments.processes; i++) {
            const flowID = `${this.workerIndex}_${i}`;
            console.log(`Worker ${this.workerIndex}: Creating ${this.roundArguments.contractId} flow ${flowID}`);
            const request = {
                contractId: this.roundArguments.contractId,
                contractFunction: 'InitFlowExecution',
                invokerIdentity: 'TrustCAAdmin',
                contractArguments: [flowID],
                readOnly: false
            };

            await this.sutAdapter.sendRequests(request);
        }
    }

    async submitTransaction() {
        const randomId = Math.floor(Math.random()*this.roundArguments.processes);

        let payload = {
            ID: `${this.workerIndex}_${randomId}`,
            Action: '',
            ActionArgs: {}
        };
        const myArgs = {
            contractId: this.roundArguments.contractId,
            contractFunction: 'GetFlowStatus',
            invokerIdentity: 'TrustCAAdmin',
            contractArguments: [JSON.stringify(payload)],
            readOnly: true
        };

        await this.sutAdapter.sendRequests(myArgs);
    }

    async cleanupWorkloadModule() { }
}

function createWorkloadModule() {
    return new MyWorkload();
}

module.exports.createWorkloadModule = createWorkloadModule;