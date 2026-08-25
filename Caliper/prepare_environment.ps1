#NETWORK_ID=n-3F5F2Q4FH5E5PEAS5ZYPRP2IRU
# kreiraj network_info.txt
# ne zaboravi da ukljucis vpc endpoint
# ne zaboravi da prekopiras orderera u ini

ssh -i "nnd-ec2.pem" ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com "rm -f /home/ec2-user/managedblockchain-tls-chain.pem;rm -f /home/ec2-user/configtx.yaml;rm -f /home/ec2-user/orgchannel.pb;rm -f /home/ec2-user/orgchannel.block;rm -f /home/ec2-user/caliper-workspace/networks/test-network.yaml; rm -rf /home/ec2-user/org*/"

python .\generate-docker-compose-files.py
python .\generate-configtx.py
python .\generate-configure_networksh_new.py
python .\generate-benchmark-config.py

scp -i "nnd-ec2.pem" -r ./output/org1 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org2 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org3 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org4 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org5 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org6 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org7 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org8 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org9 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org10 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org11 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/org12 ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/

scp -i "nnd-ec2.pem" -r ./output/configtx.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/
scp -i "nnd-ec2.pem" -r ./output/benchmark_config.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/caliper-workspace/benchmarks/config.yaml

# pokreni na serveru da dobijes nazive fajlova za svaku org
ls ./org1/admin-msp/keystore/ && ls ./org2/admin-msp/keystore/ && ls ./org3/admin-msp/keystore/ && ls ./org4/admin-msp/keystore/ && ls ./org5/admin-msp/keystore/ && ls ./org6/admin-msp/keystore/ && ls ./org7/admin-msp/keystore/ && ls ./org8/admin-msp/keystore/ && ls ./org9/admin-msp/keystore/ && ls ./org10/admin-msp/keystore/ && ls ./org11/admin-msp/keystore/ && ls ./org12/admin-msp/keystore/

python .\generate-connection-profiles.py
scp -i "nnd-ec2.pem" -r ./output/org1/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org1/
scp -i "nnd-ec2.pem" -r ./output/org2/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org2/
scp -i "nnd-ec2.pem" -r ./output/org3/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org3/
scp -i "nnd-ec2.pem" -r ./output/org4/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org4/
scp -i "nnd-ec2.pem" -r ./output/org5/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org5/
scp -i "nnd-ec2.pem" -r ./output/org6/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org6/
scp -i "nnd-ec2.pem" -r ./output/org7/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org7/
scp -i "nnd-ec2.pem" -r ./output/org8/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org8/
scp -i "nnd-ec2.pem" -r ./output/org9/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org9/
scp -i "nnd-ec2.pem" -r ./output/org10/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org10/
scp -i "nnd-ec2.pem" -r ./output/org11/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org11/
scp -i "nnd-ec2.pem" -r ./output/org12/connection_profile.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/org12/

python .\generate-caliper-test-network-description.py
scp -i "nnd-ec2.pem" -r ./output/test-network.yaml ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/caliper-workspace/networks/

# copy results
scp -i "nnd-ec2.pem" -r ec2-user@ec2-13-220-192-1.compute-1.amazonaws.com:/home/ec2-user/caliper-workspace/results/ .