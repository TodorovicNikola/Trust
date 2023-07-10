import { CertificateAuthority } from "./CertificateAuthority";

export interface Organization {
    id: String,
    name: String,
    host: String,
    port: String,
    status: String,
    role: String,
    ca?: CertificateAuthority,
}