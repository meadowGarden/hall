tableextension 50106 "Customer Ext" extends Customer
{
    fields
    {
        field(50101; "Reward ID"; Code[30])
        {
            TableRelation = Reward."Reward ID";
            ValidateTableRelation = true;

            trigger OnValidate()
            begin
                if (Rec."Customer ID" <> xRec."Customer ID") and (Rec.Blocked <> Blocked::" ") then begin
                    Error('cannot update blocked customer');
                end;
            end;
        }
    }
}
