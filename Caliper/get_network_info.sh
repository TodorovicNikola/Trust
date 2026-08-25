NETWORK_IDD="n-IR3WCA5WSNHHPJVJL5YKLL4VKQ"

for MEMBERR in $(aws managedblockchain list-members --network-id $NETWORK_IDD --query "Members[].Id" --output text); do
    ORG_NAME=$(aws managedblockchain get-member --network-id $NETWORK_IDD --member-id $MEMBERR --query "Member.Name" --output text)
    echo ""
    echo "[$ORG_NAME]"
    echo "org_name = $ORG_NAME"
    echo "member_id = $MEMBERR"
    CA=$(aws managedblockchain get-member --network-id $NETWORK_IDD --member-id $MEMBERR --query "Member.FrameworkAttributes.Fabric.CaEndpoint" --output text)    echo "ca_endpoint = $CA"

    for NODE in $(aws managedblockchain list-nodes --network-id $NETWORK_IDD --member-id $MEMBERR --query "Nodes[].Id" --output text); do
        echo "node_id = $NODE"
        PEER=$(aws managedblockchain get-node \
            --network-id $NETWORK_IDD \
            --member-id $MEMBERR \
            --node-id $NODE \
            --query "Node.FrameworkAttributes.Fabric.PeerEndpoint" --output text)
        echo "peer_endpoint = $PEER"
    done

    echo '###########################################'
done