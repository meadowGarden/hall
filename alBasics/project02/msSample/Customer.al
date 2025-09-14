table 50105 Customer
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; "Customer ID"; Code[30])
        {
            DataClassification = ToBeClassified;
        }
    }

    keys
    {
        key(PK; "Customer ID")
        {
            Clustered = true;
        }
    }
}
