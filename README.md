# Event Contract Template

# Scope
This schema defines the contract for patient questionnaire response (patient symptoms).

## Boilerplate to update
- [ ] Choose the name of the contract. This should be the suffix of the topic name minus the version. This is based on the naming strategy defined in the [Events Topic Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1765998701/Event+Topic+Standards). Example: `emr-patient`
- [ ] Replace `ronin-contract-event-template` with the contract name in the following places:
  - [ ] `v1/ronin-contract-event-template.schema.json`
  - [ ] `.github/workflows/cicd.yaml`

# Usage
This contains a simple `Makefile` for automating validation and document generation.  
- `make test`: Validate each versioned schema against all of its example files.
- `make doc`: Compile human readable HTML documentation for each versioned schema
- `make clean`: Cleans up all generated files

# Links
- [Event Contract Management Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1797521454/Event+Contract+Management+Standard)
- [Ronin Event Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1748041738/Ronin+Event+Standard)
- [Event Topic Standards](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1765998701/Event+Topic+Standards)
- [Event Contract Tooling Docker Image](https://github.com/projectronin/ronin-contract-event-tooling)
- [Event Contract CI/CD Workflow](https://github.com/projectronin/github/blob/event_contract_cicd/.github/workflows/event_contract_cicd.yaml)
