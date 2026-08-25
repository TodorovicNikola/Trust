run_caliper_benchmarks() {
    DIRR=results/medium_nodes_3_orgs

    mkdir -p $DIRR

    echo "Starting benchmark rounds..."

    for i in {1..7}
    do
        echo "------------------------------------------"
        echo "Running Round $i..."
        echo "------------------------------------------"

        npx caliper launch manager --caliper-workspace ./ --caliper-networkconfig networks/test-network.yaml --caliper-benchconfig benchmarks/config.yaml --caliper-flow-only-test --caliper-bind-sut fabric:2.2 --caliper-report-path "$DIRR/round_$i.html"

        echo "Round $i complete."
    done

    echo "All rounds finished!"
}

run_caliper_benchmarks