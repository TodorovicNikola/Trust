import { ChannelOrganization } from "./ChannelOrganization";

export interface Channel {
    id: String,
    name: String,
    endorsementPolicy: String,
    status: String,
    organizations: ChannelOrganization[],
}