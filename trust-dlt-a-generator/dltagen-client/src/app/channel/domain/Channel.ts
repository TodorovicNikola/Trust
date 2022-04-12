import { Organization } from "./Organization";

export interface Channel {
    id: String,
    name: String,
    endorsementPolicy: String,
    status: String,
    organizations: Organization[],
}