table 50101 "Reward"
{
    DataClassification = ToBeClassified;
    fields
    {
        field(1; "Reward ID"; Code[30])
        {
            DataClassification = ToBeClassified;
        }

        field(2; "Description"; Text[250])
        {
            NotBlank = true;
        }

        field(3; "Reward Percentage"; Decimal)
        {
            MinValue = 0;
            MaxValue = 100;
            DecimalPlaces = 2;
        }
    }

    keys
    {
        key(PK; "Reward ID")
        {
            Clustered = true;
        }
    }
}
